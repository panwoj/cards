package com.wpirog.cards.service;

import com.wpirog.cards.domain.Card;
import com.wpirog.cards.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository repository;

    public String getCardNumber(Long customerId) {
        return repository.findById(customerId).orElse(new Card()).getCardNumber();
    }

    public void saveCard(String cardNumber) {
        repository.save(Card.builder().cardNumber(cardNumber).build());
    }
}

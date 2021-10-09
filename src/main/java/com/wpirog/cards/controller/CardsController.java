package com.wpirog.cards.controller;

import com.wpirog.cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cards")
public class CardsController {
    @Autowired
    private CardService cardService;

    @GetMapping
    public String getCard(@RequestParam Long customerId) {
        return cardService.getCardNumber(customerId);
    }

    @PostMapping
    public void saveCard(@RequestParam String cardNumber) {
        cardService.saveCard(cardNumber);
    }
}

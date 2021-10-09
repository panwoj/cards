package com.wpirog.cards.repository;

import com.wpirog.cards.domain.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CardRepository extends CrudRepository<Card, Long> {
    @Override
    Optional<Card> findById(Long customerId);

    @Override
    Card save(Card card);
}

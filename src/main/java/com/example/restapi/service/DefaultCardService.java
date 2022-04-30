package com.example.restapi.service;

import com.example.restapi.model.Card;
import com.example.restapi.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCardService implements CardService {

    private final CardRepository cardRepository;

    public DefaultCardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public void createCard(Card card) {
        cardRepository.save(card);
    }

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }
}

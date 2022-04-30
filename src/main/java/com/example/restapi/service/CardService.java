package com.example.restapi.service;

import com.example.restapi.model.Card;

import java.util.List;

public interface CardService {
    void createCard(Card card);

    List<Card> getAll();
}

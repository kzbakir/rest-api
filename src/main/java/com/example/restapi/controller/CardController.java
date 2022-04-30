package com.example.restapi.controller;

import com.example.restapi.model.Card;
import com.example.restapi.service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping()
    public List<Card> getAll() {
        return cardService.getAll();
    }

    @PostMapping()
    public void createCard(Card card) {
        cardService.createCard(card);
    }
}

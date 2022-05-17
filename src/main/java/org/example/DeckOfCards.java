package org.example;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards() {
        List<String> suits = Card.getValidSuits();
        List<String> faceNames= Card.getValidFaceNames();

        deck = new ArrayList<>();
        for(String suit:suits){
            for (String faceName:faceNames){
                deck.add(new Card(faceName, suit));
            }
        }
    }
    public String toString(){
        return String.format(String.valueOf(deck));
    }

}

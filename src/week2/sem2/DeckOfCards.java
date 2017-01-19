/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.sem2;

import java.util.ArrayList;

/**
 *
 * @author janid
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        
        String[] suits = {"spades", "hearts", "clubs", "diamonds"};
        String[] faceName = {"two", "three", "four", "five", "six", "seven" , "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};
        
        
        
     for( String suit: suits)
     {
         for(int i = 0; i <faceName.length; i++)
         {
             Card newCard = new Card(faceName[i], suit, i+2);
             deck.add(newCard);
         }
     }
     
     
    }
    @Override
    public String toString()
    {
        String deckString= "";
        for(Card card : deck)
        {
            deckString += card.toString() + "\n";
        }
        return deckString;
    }
    
}

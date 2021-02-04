/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacktesting;

import java.util.ArrayList;

/**
 *
 * @author erngl
 */
public class Deck {
    
    public ArrayList<Card> deck= new ArrayList<>();
    
    
    private String [] suit= {"Spades", "Clubs","Hearts","Diamonds"};
    private String [] rank= {"2", "3","4","5","6", "7","8","9","10","Jack","Queen", "King", "Ace" };
    
    public Deck() //Default Constructor
    {
        for (int i=0; i< 52 ; i++)  //Initialazing deck array
        {
            Card card =new Card(suit[i/13],rank[i%13]);
            deck.add(card);
        }
    }
}

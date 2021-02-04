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
public class BlackjackTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        
        Deck deck=new Deck();
        for (int i=0;i<52;i++){
          System.out.println(deck.deck.get(i).rank+" of "+deck.deck.get(i).suit);
          }
	}
        
    
    
}
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Sheldon Kemper
 */
public interface Player {
    
    Hand getHand();
    Hand setHand();
    boolean clearHand();
    void setPlayerName(String aName);
    String getPlayerName();
    
    
}

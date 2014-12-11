/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;

import citbyui.cit260.connect4.enums.GameType;

/**
 *
 * @author Loren
 */
public class Game {
    
    String Player[];
    String Players[];
    
    public void OnePlayerGame(){
        PlayerName name = new PlayerName();
        Player = name.getName();
        
        
    }
    
    public void TwoPlayerGame(){
        PlayerName name = new PlayerName();
        Players = name.getNames();
    }

    public GameType getGameType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

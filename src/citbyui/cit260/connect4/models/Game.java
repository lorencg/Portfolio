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
    
    public void OnePlayerGame(String p1name){
        PlayerName name = new PlayerName();
        String p1=p1name;
        Player = name.getName(p1);
        
        
    }

    public String[] getPlayer() {
        return Player;
    }

    public void setPlayer(String[] Player) {
        this.Player = Player;
    }

    public String[] getPlayers() {
        return Players;
    }

    public void setPlayers(String[] Players) {
        this.Players = Players;
    }
    
    public void TwoPlayerGame(String p1Name,String p2Name){
        PlayerName name = new PlayerName();
        String p1 = p1Name;
        String p2 = p2Name;
        
        Players = name.getNames(p1,p2);
    }

    public GameType getGameType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
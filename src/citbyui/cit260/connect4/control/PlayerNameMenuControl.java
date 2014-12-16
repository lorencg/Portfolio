/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.control;

import citbyui.cit260.connect4.models.Game;
import citbyui.cit260.connect4.models.PlayerName;

/**
 *
 * @author SexyMama
 */
public class PlayerNameMenuControl {
    
    public static void savePlayersName(Game game, String playerAName) {
       if (game == null 
               || playerAName == null) {
           throw new IllegalArgumentException("savePlayersNames - parameter value is null");
       }
       PlayerName playerA = game.getPlayerA();
       playerA.setName(playerAName);
    }
    
    public static void savePlayersNames(Game game, String playerAName, String playerBName) {
       if (game == null 
               || playerAName == null
               || playerBName == null) {
           throw new IllegalArgumentException("savePlayersNames - parameter value is null");
       }
       PlayerName playerA = game.getPlayerA();
       PlayerName playerB = game.getPlayerB();
       playerA.setName(playerAName);
       playerB.setName(playerBName);
    }
}


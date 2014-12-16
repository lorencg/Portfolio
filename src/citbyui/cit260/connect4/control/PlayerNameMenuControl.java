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
    public static void savePlayersNames(Game game, String player1Name, String player2Name) {
       if (game == null 
               || player1Name == null
               || player2Name == null) {
           throw new IllegalArgumentException("savePlayersNames - parameter value is null");
       }
       PlayerName player1 = game.getPlayer1();
       PlayerName player2 = game.getPlayer2();
       player1.setName(player1Name);
       player2.setName(player2Name);
    }

    public static String setName(String player1Name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

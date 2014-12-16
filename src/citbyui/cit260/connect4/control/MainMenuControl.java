/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.control;

import citbyui.cit260.connect4.enums.PlayerType;
import citbyui.cit260.connect4.enums.GameType;
import citbyui.cit260.connect4.models.Game;
import citbyui.cit260.connect4.models.PlayerName;

/**
 *
 * @author Josh
 */
public class MainMenuControl {
    
    private static final String PLAYER_A_DEFAULT_MARKER = "1";
    private static final String PLAYER_B_DEFAULT_MARKER = "2";
    
    public Game create(GameType gameType) {
        Game game = null;
        PlayerName player1 = null;
        PlayerName player2 = null;
        
        if (gameType == null) {
            throw new IllegalArgumentException ("MainCommands - create: gameType is null");
        }
        
        if (gameType == GameType.ONE_PLAYER) {
            game = new Game(GameType.ONE_PLAYER);
            player1 = new PlayerName(PlayerType.REGULAR_PLAYER, PLAYER_A_DEFAULT_MARKER);
            player2 = new PlayerName(PlayerType.COMPUTER_PLAYER, PLAYER_B_DEFAULT_MARKER);
        }
        else if (gameType == GameType.TWO_PLAYER) {
            game = new Game(GameType.TWO_PLAYER);
            player1 = new PlayerName(PlayerType.REGULAR_PLAYER, PLAYER_A_DEFAULT_MARKER);
            player2 = new PlayerName(PlayerType.REGULAR_PLAYER, PLAYER_B_DEFAULT_MARKER);

        }
         
        game.setPlayer1(player1);
        game.setPlayer2(player2);
        
        return game;
    } 
    
}

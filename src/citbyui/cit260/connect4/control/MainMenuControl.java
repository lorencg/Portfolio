/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.control;


import citbyui.cit260.connect4.views.HelpMenuView;
import citbyui.cit260.connect4.enums.GameStatus;
import citbyui.cit260.connect4.enums.GameType;
import citbyui.cit260.connect4.control.StatsMenuControl;
import citbyui.cit260.connect4.models.Game;
import citbyui.cit260.connect4.control.StatsMenuControl;
import citbyui.cit260.connect4.models.Board;
import citbyui.cit260.connect4.views.StatsMenuView;

/**
 *
 * @author Josh
 */
public class MainMenuControl {
    public void displayHelpMenu(){
        HelpMenuView help = new HelpMenuView();
        help.getInput();
    }
    public void displayStatsMenu(){
        StatsMenuView stats = new StatsMenuView();
        stats.getInput();
    }

    public void displayBoard(){
        Board board = new Board();
        board.displayBoard();
    }
    public void startGameOne(){
        Game gameOne = new Game();
        gameOne.OnePlayerGame(null);
    }
    public void startGameTwo(){
        Game gameTwo = new Game();
        gameTwo.TwoPlayerGame(null, null);
    }
    
    
    
    public MainMenuControl() {
    }

    @Override
    public String toString() {
        return "MainMenuController{" + '}';
    }

    public Game create(GameType gameType) {
        return null;
    }
    
}
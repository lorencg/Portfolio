/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import citbyu.cit260.connect4.views.StatsMenuView;
import citbyu.cit260.connect4.views.SettingsMenuView;
import citbyu.cit260.connect4.views.HelpMenuView;
import byui.cit260.connect4.enums.GameStatus;

/**
 *
 * @author Josh
 */
public class MainMenuController {
    public void displayHelpMenu(){
        HelpMenuView help = new HelpMenuView();
        help.getInput();
    }
    
    public void displaySettingsMenu(){
        SettingsMenuView settings = new SettingsMenuView();
        settings.getInput(GameStatus status);
    }
    
    public void displayStatsMenu(){
        StatsMenuView stats = new StatsMenuView();
        stats.getInput();
    }

    public void displayBoard(){
        Board board = new Board();
        board.displayBoard();
    }
    
    
    
    public MainMenuController() {
    }

    @Override
    public String toString() {
        return "MainMenuController{" + '}';
    }
    
}

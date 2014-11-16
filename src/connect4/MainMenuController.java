/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Josh
 */
public class MainMenuController {
    void displayHelpMenu(){
        HelpMenuView help = new HelpMenuView();
        help.getInput();
    }
    
    void displaySettingsMenu(){
        SettingsMenuView settings = new SettingsMenuView();
        settings.getInput();
    }
    
    void displayStatsMenu(){
        StatsMenuView stats = new StatsMenuView();
        stats.getInput();
    }

    public MainMenuController() {
    }

    @Override
    public String toString() {
        return "MainMenuController{" + '}';
    }
    
}

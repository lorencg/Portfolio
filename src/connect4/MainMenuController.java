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
    private void displayHelpMenu(){
        HelpMenuView help = new HelpMenuView();
        help.getInput();
    }
    
    private void displaySettingsMenu(){
        SettingsMenuView settings = new SettingsMenuView();
        settings.getInput();
    }
    
    private void displayStatsMenu(){
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

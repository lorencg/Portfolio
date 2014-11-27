/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.connect4.views;


import connect4.Connect4Error;
import connect4.MainMenuController;
import java.util.Scanner;
/**
 *
 * @author 
 */


public class MainMenuView {
    
    
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"S", "Settings"},
        {"H", "Help"},
        {"A", "Statistics"},
        {"Q", "Quit Game"}
    }; 
  
    MainMenuController mainMenuControl = new MainMenuController();
    
    public MainMenuView() {

    }
    public void displayWelcome() {
    System.out.println("\nWelcome to Connect 4!\n");
    }
    
    public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    //this.mainMenuControl.startGameOne();
                    break;
                case "2":
                    //this.mainMenuControl.startGameTwo();
                    break;
                case "S":
                    this.mainMenuControl.displaySettingsMenu();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();                      
                    break;
                case "A":
                    this.mainMenuControl.displayStatsMenu();
                    break;
                case "Q":
                    break;
                default: 
                   new Connect4Error().displayError("Invalid command. Please enter either 1, 2, S, H, or Q.");
                   continue;                    
            }
        } while (!command.equals("Q"));

       // return;
    }
    

    
    
   public final void display() {
        System.out.println("\n\t============================== Main Menu =================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }   
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;


import java.util.Scanner;

/**
 *
 * @author jacksonrkj
 */


public class MainMenuView {
    
    
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"H", "Help"},
        {"S", "Settings"},
        {"Q", "Connect "}
    }; 
  
    MainMenuController mainMenuControl = new MainMenuController();
    
    public MainMenuView() {

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
                    System.out.println("Hello");
                    break;
                case "2":
                    //this.mainMenuControl.startGame(2);
                    break;
                case "H":
                    //this.mainMenuControl.displayHelpMenu();            
                    break;
                case "S":
                    //this.mainMenuControl.displaySettingsMenu();            
                    break;
                case "Q":
                    break;
                default: 
                   // new TicTacToeError().displayError("Invalid command. Please enter a valid command.");
                   // continue;                    
            }
        } while (!command.equals("Q"));

       // return;
    }
    

    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }   
    
}

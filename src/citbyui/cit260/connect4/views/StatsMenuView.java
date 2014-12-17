/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.views;

import citbyui.cit260.connect4.models.Connect4Error;
import citbyui.cit260.connect4.control.StatsMenuControl;
import java.util.Scanner;
/**
 *
 * @author Kayla Lindstrom and Patti Jones
 */
public class StatsMenuView {
    private final static String[][] menuItems = {
        {"1", "Player 1 Statistics"},
        {"2", "Player 2 Statistics"}, 
        {"H", "Help Menu"},       
        {"Q", "Quit Statistics"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private StatsMenuControl statsMenuControl = new StatsMenuControl();
    
    // default constructor
    public StatsMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
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
                    this.statsMenuControl.displayOneStats();
                    break;
                case "2":
                    this.statsMenuControl.displayTwoStats();
                    break;
                case "S":
                    this.statsMenuControl.displayHelp();
                    break;                  
                case "Q":
                    break;
                default: 
                    new Connect4Error().displayError("Invalid command. Please enter 1, 2, H, or Q");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t============================= Statistics Menu ==================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < StatsMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t================================================================================\n");
    }

    public StatsMenuControl getStatsMenuControl() {
        return statsMenuControl;
    }

    public void setStatsMenuControl(StatsMenuControl statsMenuControl) {
        this.statsMenuControl = statsMenuControl;
    }
  
}
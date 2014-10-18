package connect4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Faron Young and Sarah Oesterle
 */
public class SettingsMenuView {
        private final static String[][] menuItems = {
        {"T", "Token Color"},
        {"B", "Background Color"}, 
        {"G", "Game Board Color"}, 
        {"M", "Main Menu"}  //Goes to Main Menu       
    };       
       
    
    // Create instance of the SettingsMenuControl (action) class
    private SettingsMenuControl SettingsMenuControl = new SettingsMenuControl();
    
    // default constructor
    public SettingsMenuView() {
        
    } 
    
    // display the Settings menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    this.SettingsMenuControl.displayTokenColor();
                    break;
                case "B":
                    this.SettingsMenuControl.displayBackgroundColor();
                    break;
                case "G":
                    this.SettingsMenuControl.displayGameBoardColor();
                    break;
                case "M":
                    this.SettingsMenuControl.displayMainMenu();
                    break;    
                default: 
                    new Connect4Error().displayError("Invalid Please type I,T,or Q");
                    continue;
            }
        } while (!command.equals("M"));  
        
         return;
    }

        // displays the Settings menu
    public final void display() {
        System.out.println("\n\t============================= Settings Menu ==================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < SettingsMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}


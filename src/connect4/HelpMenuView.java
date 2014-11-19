/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Scanner;



/**
 *
 * @author 
 */
public class HelpMenuView extends Menu  {
   private static String command;  
   
   
   
   
   private final static String[][] menuItems = {
        {"I", "Instructions"},
        {"T", "Tips"}, 
        {"Q", "Quit Help"}     //Goes to Main Menu       
    };       
    
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
        
    } 

    public static String[][] getMenuItems() {
        return menuItems;
    }

    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }
   
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "I":
                    this.helpMenuControl.displayInstructionHelp();
                    break;
                case "T":
                    this.helpMenuControl.displayTipsHelp();
                    break;
                case "Q": 
                    break;
                default: 
                    new Connect4Error().displayError("Invalid Please type I,T,or Q");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
@Override
        // displays the help menu
    public final void display() {
        System.out.println("\n\t============================ Help Menu ===================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;

/**
 *
 * @author Faron
 */
import citbyui.cit260.connect4.views.MainMenuView;
import java.util.Scanner;

public class getMoves {
    
    public String getMove(){

    boolean validInput = false;
    Scanner in = new Scanner(System.in);
    String move = null;
        
    while (!validInput) {
    
        System.out.println("Please enter a column number to place your token: ");
        
        move = in.nextLine();
        move = move.trim().toUpperCase();
            
        switch (move) {
            case "A":
            case "B":
            case "C": 
            case "D":
            case "E":
            case "F":
            case "G":
                validInput = true;
                break;
            case "Q":
                MainMenuView main = new MainMenuView();
                main.getInput();
                validInput = true;
            default: 
                new Connect4Error().displayError("Invalid Please enter a column or Q");
                continue;
        
      

        } 
    }
    System.out.println(move);
    return move;
    }
}

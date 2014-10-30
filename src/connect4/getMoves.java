/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Faron
 */
import java.util.Scanner;
import java.awt.Point;

public class getMoves {
    
    public Point getMove(){

    boolean validInput = false;
    Scanner in = new Scanner(System.in);
    String[] move;
    Point location = null;
        
    while (!validInput) {
    
        System.out.println("Please enter a row and column number to place your token: ");
        
        String coordinates = in.nextLine();
        coordinates = coordinates.trim().replace(',', ' ');
        //put the coordinates into the array
        move = coordinates.split("\\s");
        
        //check if value was entered
        if(move.length < 1){
            new Connect4Error().displayError("Please enter both a row and a column or type Q to quit");
            continue;
        }
        //check if only 1 value was entered, if so was it to quit?
        else if (move.length == 1) {
            if (move[0].toUpperCase().equals("Q")){
                return null;
        } else {//if not to quit, please enter 2 values not 1
                new Connect4Error().displayError("Please enter both a row and a column or type Q to quit");
                continue;
            }
        }
        
        //check if int was entered for both coordinates
        String regExpressionPattern = ".*\\d.*";
        if (!move[0].matches(regExpressionPattern) || !move[1].matches(regExpressionPattern)) {
            new Connect4Error().displayError("Please use 2 numbers to indicate the coordinates or Q to quit");
            continue;
        }
        
        //change the string coordinates back to int
        int row = Integer.parseInt(move[0]);
        int column = Integer.parseInt(move[1]);
        
        location = new Point(row -1, column -1);
        break;
        
        }
    return location;
    } 
}
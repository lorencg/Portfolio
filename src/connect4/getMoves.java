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


public class getMoves {
    boolean validInput = false;
    int column = 0;
    double length;
    Scanner in = new Scanner(System.in);
    while (!validInput) {
        System.out.println("Please enter a valid input (1-7)");
        column = in.nextLine();
        if (column < 1 || column > 7) {
            System.out.println("Please enter a valid input (1-7). Try again.");
            continue;
        }
        if (length < 1 || length > 1) {
            System.out.println("Please enter one number between 1 and 7");
        }
    }
    
}

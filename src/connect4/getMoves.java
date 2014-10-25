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
    int column;
    int columnHeight;
    Scanner in = new Scanner(System.in);
    public int moves(){
    System.out.println("Please enter a valid input (1-7)");
    while (!validInput) {
        column = in.nextInt();
        String number = String.valueOf(column);
        if (column < 1 || column > 7) {
            System.out.println("Please enter a valid input (1-7). Try again.");
            continue;
        }
        
        if (number.length() < 1) {
            System.out.println("Please enter exactly one number!");
        continue;
        }
    }
        validInput = true;
    return column;
    }
    
    public int height() {
         for (columnHeight = 1; columnHeight <= 6; columnHeight++){
    if (columnHeight > 6) {
        System.out.println("This column is full. Please pick another column.");
}
}
    return columnHeight;
    }
}

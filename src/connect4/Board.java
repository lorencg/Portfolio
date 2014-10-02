/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author SexyMama
 */
public class Board {
    int rows = 6;
    int columns = 7;
    
    
public void displayBoard() {
    System.out.println("There are " + this.rows + " rows");
    System.out.println("There are " + this.columns + " columns");
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Scanner;

/**
 *
 * @author SexyMama
 */
public class Board {
    int rows = 6;
    int columns = 7;
    String move = "";
    int A=0,B=0,C=0,D=0,E=0,F=0,G=0; //variables to represent columns on board
           
    
public void displayBoard() {
    System.out.println("There are " + this.rows + " rows");
    System.out.println("There are " + this.columns + " columns");
}
public void enterNextMove() {  //Faron Young - Prompt and Evaluate move for Column Increments
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your move by selecting play column (A-G)");
    this.move = input.next();
    System.out.println("You entered column " + this.move + ".");  
    this.move = move.toUpperCase();
    switch(move){
        case "A":
            A++;printColumnValues();break;
        case "B":
            B++;printColumnValues();break;
        case "C":
            C++;printColumnValues();break;
        case "D":
            D++;printColumnValues();break;
        case "E":
            E++;printColumnValues();break;
        case "F":
            F++;printColumnValues();break;
        case "G":
            G++;printColumnValues();break;
        default:
            System.out.println("\tInvalid move, Please enter columen letter A through E");
            enterNextMove();
    }     
}
public void printColumnValues(){  //Faron Young - Check stored column Values after user moves
    System.out.println("\"A\"="+A);
    System.out.println("\"B\"="+B);
    System.out.println("\"C=\""+C);
    System.out.println("\"D\"="+D);
    System.out.println("\"E\"="+E);
    System.out.println("\"F\"="+F);
    System.out.println("\"G\"="+G);
    
}   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Objects;
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
           
    private class Tokens {
           private String color = "red or black";
    private int size = 5;
    Scanner in = new Scanner(System.in);
       private int x;
       
       boolean red = false;
       boolean black = false; 
       String input = in.next();
       public void displayToken(){
        System.out.println(this.color + " with the size of: " + this.size);
    }
     // Author Faron, Josh, Sarah
    public void tokenColor() {
        // This function when called will take input and will check if R is input then if it is return true to red, Same to black.
        for (x=0  ; x<2 ;  x++ ) {
            if ("R".equals(input) ){
                red = true;
                 return;
            }
            
            else if("B".equals(input)) {
                    black = true;
                     return;  
            }
            else
                System.out.println("Error...Please choose R for Red or B for Black." );
                return;
                
                
                                      
            }
        
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Tokens{" + "color=" + color + ", size=" + size + ", in=" + in + ", x=" + x + ", red=" + red + ", black=" + black + ", input=" + input + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tokens other = (Tokens) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (!Objects.equals(this.in, other.in)) {
            return false;
        }
        if (this.x != other.x) {
            return false;
        }
        if (this.red != other.red) {
            return false;
        }
        if (this.black != other.black) {
            return false;
        }
        if (!Objects.equals(this.input, other.input)) {
            return false;
        }
        return true;
    }
           
           
           
       } 
public void displayBoard() {
    int t, i;
    int table[][] = new int[6][7];
    
    for(t=0; t < 6; ++t) {
        for(i=0; i < 7; ++i){
            table[t][i] = (t * 4) + i + 1;
            System.out.println(table[t][i] + ' ');
        }
    }
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

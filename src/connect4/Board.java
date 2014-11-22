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
    private int printRow = 0;
    private int printColumns =0;
    private int rows = 6;
    private int columns = 7;
    private String move = "";
    private int A=0,B=0,C=0,D=0,E=0,F=0,G=0; //variables to represent columns on board
    private final String emptyString=" ";
     private final String board [][]= new String [6][7]; 
        
    
    
public void displayBoard() {
    System.out.println("A | B | C | D | E | F | G |");
    for(printRow=0 ;printRow < 6; ++printRow){
       for(printColumns = 0;printColumns < 7; ++printColumns){
           board[printRow][printColumns]=emptyString;
           System.out.print(board[printRow][printColumns] + " | ");
   } 
        System.out.println();
    }
}
    




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

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getE() {
        return E;
    }

    public void setE(int E) {
        this.E = E;
    }

    public int getF() {
        return F;
    }

    public void setF(int F) {
        this.F = F;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    @Override
    public String toString() {
        return "Board{" + "rows=" + rows + ", columns=" + columns + ", move=" + move + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + ", F=" + F + ", G=" + G + '}';
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
        final Board other = (Board) obj;
        if (this.rows != other.rows) {
            return false;
        }
        if (this.columns != other.columns) {
            return false;
        }
        if (!Objects.equals(this.move, other.move)) {
            return false;
        }
        if (this.A != other.A) {
            return false;
        }
        if (this.B != other.B) {
            return false;
        }
        if (this.C != other.C) {
            return false;
        }
        if (this.D != other.D) {
            return false;
        }
        if (this.E != other.E) {
            return false;
        }
        if (this.F != other.F) {
            return false;
        }
        if (this.G != other.G) {
            return false;
        }
        return true;
    }

}

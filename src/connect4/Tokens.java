/*
 * AUTHOR: Loren Glenn
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import static java.lang.System.in;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Loren
 */
public class Tokens {
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
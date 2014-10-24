/*
 * AUTHOR: Loren Glenn
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Loren
 */
public class Tokens {
    String color = "red or black";
    int size = 5;
    Scanner in = new Scanner(System.in);
       int x;
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
           
           
           
       } 
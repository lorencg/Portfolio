/*
 * AUTHOR: Loren Glenn
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Loren
 */
public class Tokens {
    String color = "red or black";
    int size = 5;
    
    public void displayToken(){
        System.out.println(this.color + " with the size of: " + this.size);
    }
            
}

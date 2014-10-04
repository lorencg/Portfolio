/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
    import java.util.Scanner;
/**
 *
 * @author Kayla Lindstrom
 */
public class Player2 {
    String pTwoName;
    
public void displaySecondName() {
            Scanner input = new Scanner(System.in);
            System.out.println("Player 2 enter your name: ");
            this.pTwoName = input.next();
        }
}
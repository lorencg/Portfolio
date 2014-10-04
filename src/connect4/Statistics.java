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
public class Statistics {
    int won = 5;
    int lose = 0;
    int streak = 5;
    
public void displayStatistics() {
    System.out.println("You have won " + won + " games.");
    System.out.println("You have lost " + lose + " games.");
    System.out.println("Your winning streak is " + streak + ".");
}
}
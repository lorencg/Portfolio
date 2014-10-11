/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Kayla Lindstrom
 */
public class Statistics {
    int won = 4;
    double streak = (int) 5;
    
    double totalGames = (int) 5;
    double winStats = (won / totalGames) * 100;
    double loseStats = ((totalGames - won) / totalGames) * 100;
    
    
public void displayStatistics() {
    System.out.println("You have won " + won + " games.");
    System.out.println("Your winning streak is " + streak + ".");
    System.out.println("\n\tYou have won " + winStats + "% of your games.\n");
    System.out.println("\n\tYou have lost " + loseStats + "% of your games.\n");
}
} 
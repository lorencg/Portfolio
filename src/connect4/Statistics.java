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
    double tokensUsed=(int) 0;
    double averageTokensToWin= (int)0.00;
    
public void displayStatistics() {
    System.out.println("You have won " + won + " games.");
    System.out.println("Your winning streak is " + streak + ".");
    System.out.println("\n\tYou have won " + winStats + "% of your games.\n");
    System.out.println("\n\tYou have lost " + loseStats + "% of your games.\n");
     if (won < 1 && totalGames <= 1) {
         System.out.println("\tNeed to play a game.");
     }
}
public void displayAveToken() {
    if(won>0 &&tokensUsed >0){
        averageTokensToWin = (tokensUsed / won);
        System.out.println("Your average tokens to win is" + averageTokensToWin);
    }
    else
        {System.out.println("Error, no game has been won yet.");
                
      }
    }
} 
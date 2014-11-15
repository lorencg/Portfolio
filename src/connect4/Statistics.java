/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
import java.io.Serializable;

/**
 *
 * @author Kayla Lindstrom
 */
public class Statistics implements Serializable{
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
        System.out.println("Your average tokens to win is\t" + averageTokensToWin);
    }
    else
        {System.out.println("Error, no game has been won yet\n.");
                
      }
    }
// Faron Young, Josh Siqueiros, Sarah Christian
private void getScoreSum() {
    int scoresArray [] = { 1500, 1200, 900, 800, 300, 1600, 400 };
    int sum = 0;
    for (int i=0; i < 7; i++ ) sum += scoresArray [i];
    
    System.out.println("The sum of " + (scoresArray.length) + " games played is " + sum);
    
}

private void getAverage() {
    int sum = 0;
    int nums[] = {0, 1000, 825};
    
    for (int i=0; i < nums.length; i++) {
        sum = sum + nums[i];
}
    double average = sum / nums.length;
    System.out.println("Score Average: \t" + average);
}

} 
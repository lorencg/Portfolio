/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import java.io.Serializable;

/**
 *
 * @author Kayla Lindstrom, Patti Jones
 */
public class Statistics implements Serializable{
    private int won = 4;
    private double streak = (int) 5;
    
    private double totalGames = (int) 5;
    private double winStats = (won / totalGames) * 100;
    private double loseStats = ((totalGames - won) / totalGames) * 100;
    private double tokensUsed=(int) 0;
    private double averageTokensToWin= (int)0.00;

    public Statistics() {
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public double getStreak() {
        return streak;
    }

    public void setStreak(double streak) {
        this.streak = streak;
    }

    public double getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(double totalGames) {
        this.totalGames = totalGames;
    }

    public double getWinStats() {
        return winStats;
    }

    public void setWinStats(double winStats) {
        this.winStats = winStats;
    }

    public double getLoseStats() {
        return loseStats;
    }

    public void setLoseStats(double loseStats) {
        this.loseStats = loseStats;
    }

    public double getTokensUsed() {
        return tokensUsed;
    }

    public void setTokensUsed(double tokensUsed) {
        this.tokensUsed = tokensUsed;
    }

    public double getAverageTokensToWin() {
        return averageTokensToWin;
    }

    public void setAverageTokensToWin(double averageTokensToWin) {
        this.averageTokensToWin = averageTokensToWin;
    }

    @Override
    public String toString() {
        return "Statistics{" + "won=" + won + ", streak=" + streak + ", totalGames=" + totalGames + ", winStats=" + winStats + ", loseStats=" + loseStats + ", tokensUsed=" + tokensUsed + ", averageTokensToWin=" + averageTokensToWin + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Statistics other = (Statistics) obj;
        if (this.won != other.won) {
            return false;
        }
        if (Double.doubleToLongBits(this.streak) != Double.doubleToLongBits(other.streak)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalGames) != Double.doubleToLongBits(other.totalGames)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winStats) != Double.doubleToLongBits(other.winStats)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loseStats) != Double.doubleToLongBits(other.loseStats)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tokensUsed) != Double.doubleToLongBits(other.tokensUsed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.averageTokensToWin) != Double.doubleToLongBits(other.averageTokensToWin)) {
            return false;
        }
        return true;
    }
    
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
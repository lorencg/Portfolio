/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author  Faron Young
 */
public class Scoreboard {
    boolean gameWon = false;
    int base = 1000;
    int pointslost = 25;
    double bonus = (int) 20.1;
    double playerOneMoves = (int)21.1;
    double playerTwoMoves = 21;
    double totalMoves = playerOneMoves + playerTwoMoves;  // number of moves taken during game
    double emptySpaces = 42 - totalMoves; // empty spaces left.
    double score = base - (pointslost * totalMoves) + (bonus * emptySpaces);
        

public void displayScoreboard() {
    
    System.out.println("\'Your score is " + this.score + " points.\'");
    
    System.out.println("\tThe base score is " + this.base + " points.");
    System.out.println("Each turn will lose " + this.pointslost + " points.");
    System.out.println("Each space unused when connect4 is reached will award " + this.bonus + " bonus points.");
    
}

public void isDraw() {
    if (this.totalMoves == 42 && gameWon != true){
        System.out.println("\tIt\'s a draw!");
    }
}
}
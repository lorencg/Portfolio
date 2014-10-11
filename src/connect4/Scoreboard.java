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
    int base = 1000;
    int pointslost = 25;
    double bonus = (int) 20.1;
    int x = 15;  // number of moves taken to win.
    int y = 25; // empty spaces left.
    double score = base - (pointslost * x) + (bonus * y);
        

public void displayScoreboard() {
    
    System.out.println("\'Your score is " + this.score + " points.\'");
    
    System.out.println("\tThe base score is " + this.base + " points.");
    System.out.println("Each turn will lose " + this.pointslost + " points.");
    System.out.println("Each space unused when connect4 is reached will award " + this.bonus + " bonus points.");
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Faron
 */
public class Scoreboard {
    int base = 1000;
    int pointslost = 25;
    int bonus = 20;
        

public void displayScoreboard() {
    System.out.println("The base score is " + this.base + " points.");
    System.out.println("Each turn will lose " + this.pointslost + " points.");
    System.out.println("Each space unused when connect4 is reached will award " + this.bonus + " bonus points.");
    
}
}
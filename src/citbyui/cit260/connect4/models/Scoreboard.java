/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import citbyui.cit260.connect4.models.PlayerName;
import java.util.Scanner;
import java.io.Serializable;

/**
 * @author  Faron Young
 */

public class Scoreboard implements Serializable {
    private PlayerName PlayerName = new PlayerName();
    private boolean gameWon = false;
    private int base = 1000;
    private int pointslost = 25;
    private double bonus = (int) 20.1;
    private double playerOneMoves = 21;
    private double playerTwoMoves = 21;
    private double totalMoves = playerOneMoves + playerTwoMoves;  // number of moves taken during game
    private double emptySpaces = 42 - totalMoves; // empty spaces left.
    private double score = base - (pointslost * totalMoves) + (bonus * emptySpaces);
    private String red;
    private String black;
    private String tokens[] = {red, black};

    public Scoreboard(String red, String black) {
        this.red = red;
        this.black = black;
    }

    public PlayerName getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(PlayerName PlayerName) {
        this.PlayerName = PlayerName;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public void setGameWon(boolean gameWon) {
        this.gameWon = gameWon;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getPointslost() {
        return pointslost;
    }

    public void setPointslost(int pointslost) {
        this.pointslost = pointslost;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPlayerOneMoves() {
        return playerOneMoves;
    }

    public void setPlayerOneMoves(double playerOneMoves) {
        this.playerOneMoves = playerOneMoves;
    }

    public double getPlayerTwoMoves() {
        return playerTwoMoves;
    }

    public void setPlayerTwoMoves(double playerTwoMoves) {
        this.playerTwoMoves = playerTwoMoves;
    }

    public double getTotalMoves() {
        return totalMoves;
    }

    public void setTotalMoves(double totalMoves) {
        this.totalMoves = totalMoves;
    }

    public double getEmptySpaces() {
        return emptySpaces;
    }

    public void setEmptySpaces(double emptySpaces) {
        this.emptySpaces = emptySpaces;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    public String[] getTokens() {
        return tokens;
    }

    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }
     

public void displayScoreboard() {
    System.out.println("\'Your score is " + this.score + " points.\'");
    System.out.println("\tThe base score is " + this.base + " points.");
    System.out.println("Each turn will lose " + this.pointslost + " points.");
    System.out.println("Each space unused when connect4 is reached will award " + this.bonus + " bonus points.");
}

private void isDraw() {
    if (this.totalMoves == 42 && gameWon != true){
        System.out.println("\tIt\'s a draw!");
    }
}

private void winner() {
    for (String s : tokens) {
        System.out.println(this.PlayerName + " has won!");
        }
    }
}
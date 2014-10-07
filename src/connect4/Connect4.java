/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
    import java.util.Scanner;
/**
 *
 * @author SexyMama
 */
public class Connect4 {
        String name;
        String instructions = "Each player is given either red or black \n"
                + "tokens to play. The board consists of circular slots for \n"
                + "these tokens; 7 columns wide and 6 rows high. The players \n"
                + "take turns filling in the slots with their tokens; with \n"
                + "each token placed settling into the lowest row of the \n"
                + "column placed. The game is over when one player \n"
                + "'connects 4' tokens in an uninterrupted row. Have fun! \n";
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.getName();
        Player2 pTwo = new Player2();
        pTwo.displaySecondName();
        pTwo.displayWelcome();
        myGame.displayHelp();
        Board myBoard = new Board();
        myBoard.displayBoard();
        Scoreboard myScore = new Scoreboard();
        myScore.displayScoreboard();
        Statistics stats = new Statistics();
        stats.displayStatistics();
        Tokens red = new Tokens();
        red.displayToken();
        StartMenu myStartMenu = new StartMenu();
        myStartMenu.displayStartMenu();
        RulesMenu myRulesMenu = new RulesMenu();
        myRulesMenu.displayRulesMenu();
        
    }
        public void getName() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            this.name = input.next();
        }
        
        public void displayHelp() {
            System.out.println("\nWelcome " + this.name + "\n");
            System.out.println("Help: " + this.instructions);
        }
}

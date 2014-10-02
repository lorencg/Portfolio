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
        String instructions = "Each player is given either red tokens or black to play. The board consists of circular slots for these tokens 7 columns wide and 6 rows high. The players take turns filling in the slots with their tokens with each token placed settling into the lowest row of the column placed. The game is over when one player ‘connects 4’ tokens in an uninterrupted row.";
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
        myGame.getName();
        myGame.displayHelp();
        Board myBoard = new Board();
        myBoard.displayBoard();
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

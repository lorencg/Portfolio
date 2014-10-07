/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author kadosch2
 */
public class RulesMenu {
    String Guide = "1- Only one token per turn. \n\n"
            + "2- The players may not change their move once the token has \n"
            + "been dropped. \n\n"
            + "3- If the board fills and nobody has 4 connecting pieces, \n"
            + "it is a draw.\n\n";
    
public void displayRulesMenu() {
    System.out.println("These are the rules: \n" + Guide);

}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
import java.awt.Point;
/*
 *
 * @author SexyMama
 */
public class Connect4 {
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point location = null;
        MainMenuView main = new MainMenuView();
        main.displayWelcome();
        main.getInput();
        getMoves get = new getMoves();
        location = new Point(get.getMove());
        System.out.println(location);
   
    }
    
       
}

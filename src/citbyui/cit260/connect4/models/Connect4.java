/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import citbyui.cit260.connect4.models.PlayerName;
import citbyui.cit260.connect4.views.MainMenuView;
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
          
        
        
        PlayerName name = new PlayerName();
        name.getNames();
        MainMenuView main = new MainMenuView();
        main.displayWelcome();
        main.getInput();
        
   
    }
    
       
}

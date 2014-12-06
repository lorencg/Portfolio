/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import citbyui.cit260.connect4.exceptions.Connect4Exception;
import citbyui.cit260.connect4.models.PlayerName;
import citbyui.cit260.connect4.views.MainMenuView;
import java.awt.Point;
import java.util.Scanner;
/*
 *
 * @author SexyMama
 */
public class Connect4 {
     private static final Scanner inFile = new Scanner(System.in);
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MainMenuView main = new MainMenuView();
        main.displayWelcome();
     
        Connect4 connect4 = new Connect4();
        try {
            main.getInput();
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Connect4.inFile.close();
        }
    } 
       
}

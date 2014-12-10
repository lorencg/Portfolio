/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import byui.cit210.connect4.frames.MainFrame;
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
        MainFrame mainFrame = new MainFrame();
        MainMenuView main = new MainMenuView();
        
     
        
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
                    
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (mainFrame != null)
                mainFrame.dispose();
        }
    } 
       
}

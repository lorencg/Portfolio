/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.control;
import citbyui.cit260.connect4.enums.ErrorType;
import citbyui.cit260.connect4.views.MainFrame;
import citbyui.cit260.connect4.exceptions.Connect4Exception;
import citbyui.cit260.connect4.models.PlayerName;
import java.awt.Point;
import java.util.Scanner;
/*
 *
 * @author SexyMama
 */
public class Connect4 {
     public static MainFrame mainFrame = null;
    /**
     *
     */
    
    private PlayerName[] players = new PlayerName[10];

    public Connect4() {
        
    }

    public PlayerName[] getPlayers() {
        return players;
    }

    public void setPlayers(PlayerName[] players) {
        this.players = players;
    }

        
    public static void main(String[] args) {
        Connect4 connect4 = null;
        try {  
            connect4 = new Connect4();
            
              /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Connect4.mainFrame = new MainFrame();
                    Connect4.mainFrame.setVisible(true);
                }
            });
        } 

        catch (Throwable ex) {     
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(ex.getStackTrace().toString());           
        } 
        finally {
            if (Connect4.mainFrame != null) {
                Connect4.mainFrame.dispose();
            }
        }
        
      
    }    
}

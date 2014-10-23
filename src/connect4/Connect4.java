/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
/*
 *
 * @author SexyMama
 */
public class Connect4 {
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int column;
        MainMenuView main = new MainMenuView();
        main.displayWelcome();
        main.getInput();
        getMoves test = new getMoves();
        column = test.moves();
        System.out.print(column);
        
   
    }
    
       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
import java.io.Serializable;

/**
 *
 * @author Kayla Lindstrom and Patti Jones
 */
public class StatsMenuControl implements Serializable {

    
    public void displayOneStats(){
    
    String OneStats = "Player One has won 10 times";
    
    System.out.println(OneStats);
}
    public void displayTwoStats(){
    
    String TwoStats = "Player Two has won 5 times";
    
    System.out.println(TwoStats);
}   
    public void displayHelp(){
    
    String Help = "How can we help you?";
    
    System.out.println(Help);
}

}

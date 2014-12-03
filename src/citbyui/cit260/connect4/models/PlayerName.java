/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;
import citbyui.cit260.connect4.interfaces.EnterInfo;
/**
 *
 * @author Kayla Lindstrom,Faron Young, Loren Glenn, Joshua Siqueiros, Sarah Christian
 */
public class PlayerName implements EnterInfo{
    
    @Override
    public void getNames(){
        
        String playerOne = "";
        String playerTwo = ""; 
    
        Scanner inFile = new Scanner(System.in);
        
        System.out.println("Player one please enter your name: ");
        playerOne = inFile.nextLine();
        System.out.println("Player two please enter your name: ");
        playerTwo = inFile.nextLine();
        String PlayerName[] = {playerOne, playerTwo};
        if(PlayerName[0].length() == 0 && PlayerName[1].length() == 0){
                System.out.println("Please enter a name");
        }
        for(int j=1; j<2; j++){
                if(PlayerName[j-1].length() > PlayerName[j].length()){
                String t = PlayerName[j-1];
                PlayerName[j-1] = PlayerName[j];
                PlayerName[j] = t;
            }
            for(int i=0; i<2; i++){
                System.out.println("Player" + (i+1) + ": " + PlayerName[i]);
            }
        }
            
    }  

}
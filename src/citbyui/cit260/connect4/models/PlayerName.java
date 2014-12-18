/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;
import citbyui.cit260.connect4.exceptions.PlayerException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;
import citbyui.cit260.connect4.interfaces.EnterInfo;
import java.awt.Point;
/**
 *
 * @author Kayla Lindstrom,Faron Young, Loren Glenn, Joshua Siqueiros, Sarah Christian, Patti Jones
 */
public class PlayerName{
    String playerOne;
    String playerTwo;
    String PlayerName[]={playerOne,playerTwo};
            
    public String[] getNames(String p1,String p2){
        
        playerOne = p1;
        playerTwo = p2; 
               
       
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
        return PlayerName;
    }
    
    // public void playerTakesTurn() throws PlayerException {

      //  if (PlayerName ==  null) {
        //    throw new PlayerException("Please enter your name");
        //}

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String[] getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String[] PlayerName) {
        this.PlayerName = PlayerName;
    }
     }
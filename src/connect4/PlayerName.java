/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;
import citbyui.cit260.connect4.interfaces.EnterInfo;
/**
 *
 * @author Kayla Lindstrom,Faron Young, Loren Glenn, Joshua Siqueiros, Sarah Christian
 */
public class PlayerName implements EnterInfo{
    
    private String playerOne;
    private String playerTwo; 
    private String PlayerName[] = {playerOne, playerTwo};
        
    public void getNames(){
        Scanner inFile = new Scanner(System.in);
        System.out.println("Player one please enter your name: ");
        playerOne = inFile.nextLine();
        System.out.println("Player two please enter your name: ");
        playerTwo = inFile.nextLine();
        
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

    @Override
    public String toString() {
        return "PlayerName{" + "playerOne=" + playerOne + ", playerTwo=" + playerTwo + ", PlayerName=" + PlayerName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayerName other = (PlayerName) obj;
        if (!Objects.equals(this.playerOne, other.playerOne)) {
            return false;
        }
        if (!Objects.equals(this.playerTwo, other.playerTwo)) {
            return false;
        }
        if (!Arrays.deepEquals(this.PlayerName, other.PlayerName)) {
            return false;
        }
        return true;
    }

}
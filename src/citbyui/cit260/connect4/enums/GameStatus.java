/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.enums;

/**
 *
 * @author SexyMama
 */
public enum GameStatus {
    CONTINUE ("CONTINUE"),
    NEW_GAME ("NEW_GAME"),
    PLAYING ("PLAYING"), 
    WINNER ("WINNER"), 
    TIE ("TIE"), 
    QUIT ("QUIT"), 
    ERROR ("ERROR"),
    EXIT ("EXIT");
    
    String value;
    
    GameStatus(String value) {
        this.value = value;   
    }
    
    public String getValue() {
        return value;
    }
}

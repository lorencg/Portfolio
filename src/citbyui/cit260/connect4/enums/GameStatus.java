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
    S ("Settings Menu"),
    T ("Tips"),
    B ("Background Color"), 
    G ("Game Color"), 
    H ("Help Menu"),
    I ("Instructions"), 
    Q ("Quit"),
    A ("Statistics Menu"), 
    M ("Main Menu");

String message;
private GameStatus(String message) {
    this.message = message;
}
public String getMessage() {
    return message;
}

public void display() {
     System.out.println(this.message);
}
}
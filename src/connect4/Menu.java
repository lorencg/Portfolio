/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Josh
 */
public abstract class Menu {
    private String[][] menuItems = null;

    
    
    public Menu(){}

  public abstract void display ();


public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
}
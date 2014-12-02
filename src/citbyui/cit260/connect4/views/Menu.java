/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.views;

import citbyui.cit260.connect4.interfaces.DisplayInfo;

/**
 *
 * @author Josh
 */
public class Menu implements DisplayInfo {
    public String[][] menuItems = null;

    
    
    public Menu(){}

    @Override
    public void display () {
        
    }

    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    }
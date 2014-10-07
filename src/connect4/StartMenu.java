/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author kadosch2
 */
public class StartMenu {
    String main = "\nMain Menu \n";
    String play = "Play Game \n";
    String setting = "Settings \n";
    String rules = "Rules \n";
    
public void displayStartMenu() {
    System.out.println(this.main);
    System.out.println(this.play);
    System.out.println(this.setting);
    System.out.println(this.rules);
}
}

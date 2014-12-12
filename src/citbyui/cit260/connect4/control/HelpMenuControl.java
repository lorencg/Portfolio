/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.control;
/**
 *
 * @author Josh
 */
public class HelpMenuControl {
    
// public void display{
String instructions;
public void displayInstructionHelp(){
    
     instructions = "\nEach player is given either red or black \n"
                + "tokens to play. The board consists of circular slots for \n"
                + "these tokens; 7 columns wide and 6 rows high. The players \n"
                + "take turns filling in the slots with their tokens; with \n"
                + "each token placed settling into the lowest row of the \n"
                + "column placed. The game is over when one player \n"
                + "'connects 4' tokens in an uninterrupted row. Have fun! \n";
    
    System.out.println(instructions);
        
}

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
String tips = "Its connect 4 duh.";
public void displayTipsHelp(){
    
    
    
    System.out.println(tips);
        
}

}
















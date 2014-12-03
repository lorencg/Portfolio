package citbyui.cit260.connect4.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patti Jones
 */
public class MenuException extends Exception {
    
    public MenuException () {   
    }
    
    public MenuException(String message) { 
        super(message);
    }  
    
    public MenuException(String message, Throwable cause) {   
        super(message, cause);
    }
    
    public MenuException(Throwable cause) {
        super(cause);
    }
}

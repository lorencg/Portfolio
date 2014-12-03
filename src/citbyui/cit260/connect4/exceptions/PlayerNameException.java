package citbyui.cit260.connect4.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kadosch2
 */
public class PlayerNameException extends Exception {
    
    public PlayerNameException () {   
    }
    
    public PlayerNameException(String message) { 
        super(message);
    }  
    
    public PlayerNameException(String message, Throwable cause) {   
        super(message, cause);
    }
    
    public PlayerNameException(Throwable cause) {
        super(cause);
    }
}

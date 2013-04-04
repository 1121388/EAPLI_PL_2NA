/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.InitializeBalanceController;
import eapli.util.Console;

/**
 *
 * @author Marco
 */

public class InitializeBalanceUI {    

    
    public void InitializeBalance(){
        
        double valor;
        
        valor = Console.readDouble("Insert value:");
        
        InitializeBalanceController control = new InitializeBalanceController();
        control.InitializeBalance(valor);
        
    }
}

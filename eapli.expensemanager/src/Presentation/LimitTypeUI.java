/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.LimitTypeController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Ana
 */
public class LimitTypeUI extends BasicUI {

    LimitTypeController controller = new LimitTypeController();
    
    public LimitTypeUI() {}
    
    @Override
    public void getBody() {
        int id = Console.readInteger("Limit id: ");  
        String name = Console.readLine("Limit Name: ");        
        controller.createLimitType(id, name);
    }
    
    @Override
    public String getTitle() {
        return "Limit Type Definition";
    }

    @Override
    public BasicController getController() {  
        return controller;
    }
}

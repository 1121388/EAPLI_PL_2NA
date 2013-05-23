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
        
        System.out.println("Limit type register with success");
        new java.util.Scanner(System.in).nextLine();
        System.out.flush();
        
        MainMenu menu = new MainMenu();
        menu.mainLoop();
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.LimitController;
import Model.LimitType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Hugo Silva
 */
public class LimitUI extends BasicUI{
    
    private LimitController controller = new LimitController();

    @Override
    public void getBody() {
        
        List<LimitType> list = controller.getLimitTypeList();
        int select = 0;
        for (LimitType item : list)
        {
            System.out.println(select + " - " + item.getName());
            select++;
        }
        
        Integer selected = Console.readInteger("Select the limit type: ");
        
        double v_yel = Console.readDouble("Limit Yellow Value: ");
        double v_red = Console.readDouble("Limit Red Value: ");
        BigDecimal value_yellow = new BigDecimal(v_yel);
        BigDecimal value_red = new BigDecimal(v_red);
        
        LimitType n = list.get(selected);
        
        controller.createLimit(n, value_yellow, value_red);
        
        System.out.println("Limit register with success");
        new java.util.Scanner(System.in).nextLine();
        System.out.flush();
        
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }

    @Override
    public String getTitle() {
        return "Limit Definition";
    }

    @Override
    public BasicController getController() {        
        return controller;
    }
}

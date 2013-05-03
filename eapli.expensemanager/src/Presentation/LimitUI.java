/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.EstablishmentofsavingsController;
import Controllers.LimitController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Hugo Silva
 */
public class LimitUI extends BasicUI{
    
    private LimitController controller = new LimitController();

    @Override
    public void getBody() {
        double v_w_y = Console.readDouble("Weekly Limit Yellow Value: ");
        double v_w_r = Console.readDouble("Weekly Limit Red Value: ");
        BigDecimal value_week_yellow = new BigDecimal(v_w_y);
        BigDecimal value_week_red = new BigDecimal(v_w_r);
        
        double v_m_y = Console.readDouble("Monthly Limit Yellow Value: ");
        double v_m_r = Console.readDouble("Monthly Limit Red Value: ");
        
        controller.creatLimit(0, value_week_yellow, value_week_red);
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

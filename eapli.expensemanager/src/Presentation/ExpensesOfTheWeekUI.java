/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpensesOfTheWeekController;
import java.math.BigDecimal;

/**
 *
 * @author i111051
 */
public class ExpensesOfTheWeekUI {
    
    private Controllers.ExpensesOfTheWeekController controller;
    
    public ExpensesOfTheWeekUI(){
         controller = new ExpensesOfTheWeekController();
     }
    public void mainLoop() {
        System.out.println(controller.currentlyWeekExpenses());
    }
}

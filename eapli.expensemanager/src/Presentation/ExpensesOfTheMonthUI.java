/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpensesMonthlyController;
import Controllers.ExpensesOfTheMonthController;
import java.math.BigDecimal;

/**
 *
 * @author i111051
 */
public class ExpensesOfTheMonthUI {
    private Controllers.ExpensesOfTheMonthController controller;
    
    public ExpensesOfTheMonthUI(){
         controller = new ExpensesOfTheMonthController();
     }
    public void mainLoop() {
        System.out.println(controller.currentlyMonthExpenses());
    }
}

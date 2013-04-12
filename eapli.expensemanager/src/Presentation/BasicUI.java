/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;

/**
 *
 * @author i111051
 */
public class BasicUI {
    void mainLoop(){
        BasicController bController = new BasicController();
        System.out.println("    Week Expenses: " + bController.currentWeekExpenses() + "\n");
        System.out.println("   Month Expenses: " + bController.currentWeekExpenses() + "\n");
        System.out.println("          Balance: " + bController.currentBalance() + "\n");
    }
}

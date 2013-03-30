/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Model.*;
import Presentation.*;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        ExpenseRegisterController controller = new ExpenseRegisterController();
        
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        System.out.println(controller.ExpenseTypeList());
        ExpenseType expenseType = controller.GetExpenseType(Console.readInteger("Type:"));
        
        controller.registerExpense(what, date, amount, expenseType);
         

        System.out.println("expense recorded.");
    
    }
}

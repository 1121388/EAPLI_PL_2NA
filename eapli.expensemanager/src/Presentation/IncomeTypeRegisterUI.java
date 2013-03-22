/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import Controllers.IncomeTypeRegisterController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterUI {
    
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
        String description = Console.readLine("Description:");
        IncomeTypeRegisterController controller = new IncomeTypeRegisterController();
        controller.registerIncomeType(description);
        System.out.println("Income Type Recorded.");
    }
    
}

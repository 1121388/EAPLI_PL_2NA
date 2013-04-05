/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import Controllers.IncomeTypeRegisterController;
import Model.IncomeType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

    
/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterUI {
    private IncomeTypeRegisterController controller;
    
    public IncomeTypeRegisterUI() {
    
         controller = new IncomeTypeRegisterController();
    }
    
    public void mainLoop() {
        
      
          while (true) {
            System.out.println("\n* * *  MANAGE INCOME TYPES  * * *\n");
            System.out.println("\n* * *  CURRENT INCOME TYPES  * * *\n");
            for(IncomeType inc:controller.getIncomeTypeList()){
                System.out.println(inc.toString());
            }
            
            System.out.println("1. Add an income type");
            System.out.println("0. Return\n");
            int option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0: 
                    return;
                case 1: 
                    IncomeTypeRequest();
                    break;
            }
        }
    }

    
    private void IncomeTypeRequest() {
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
        String description = Console.readLine("Description:");
        controller.registerIncomeType(description);
        System.out.println("Income Type Recorded.");
    }
        


    
     
}


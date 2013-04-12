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
            System.out.println("\n* * *  MANAGE INCOME TYPES  * * *");
            System.out.println("\n* * *  CURRENT INCOME TYPES  * * *");

            int i=1;
            for(String desc:controller.getIncomeTypeListStrings()){
                
                System.out.println(i + " - "+desc);
                i++;
            }
            
            System.out.println("\n1. Add an income type");
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
        String description;
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
        System.out.println("Description: ");
        do{
            
            description = Console.readLine("");
            
        }while(description.isEmpty());
                
        if(!controller.existsIncomeTypeByDescription(description))
        {
            controller.registerIncomeType(description);
            System.out.println("Income Type Recorded.");
        }
        else
        {
            System.out.println("Income Type already exists!");
        }
        
    }
        


    
     
}


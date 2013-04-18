/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Model.ExpenseType;
import Model.IncomeType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Nuno
 * The main objective of this class is to provide a selector UI
 * It returns the IncomeType selected by its index
 */
public class IncomeTypeSelectorUI {
    
   
    IncomeTypeRegisterController controller = new IncomeTypeRegisterController();   
    
    
    public IncomeType SelectIncomeType(boolean aCancelable) {
        System.out.println("\nIncome types list:");
        if (aCancelable) {
            System.out.println("[0] Cancel selection");
        }
        int i=0;
        List<String> listIncomeTypes = controller.getIncomeTypeListStrings();
        if(listIncomeTypes.isEmpty())
        {
            //System.out.println("There are no income types defined!\nPlease go to main menu\n");
            return null;
            
        }
        for(String desc:listIncomeTypes){
                
                System.out.println(i+1 + " - "+desc);
                i++;
        }
        
        int option = Console.readInteger("Please choose an income type");
        
        while (true) {
            switch (option) {
                case 0: 
                        return null;
                    
                default:
                    if (option < 0 || option > listIncomeTypes.size())
                    {
                        option = Console.readInteger("Please choose an income type");
                        continue;
                    }else{
                        IncomeType inc = controller.getIncomeTypeByDescription(listIncomeTypes.get(i-1));
                        return inc;
                        
                    }
                                   
                    
            }
        }
    }
    
}

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
        for(String desc:listIncomeTypes){
                
                System.out.println(i + " - "+desc);
                i++;
        }
        
        int option = Console.readInteger("Please choose an income type");
        
        while (true) {
            switch (option) {
                case 0: 
                        return null;
                    
                default:
                    IncomeType inc = controller.getIncomeTypeByDescription(listIncomeTypes.get(i));
                    if (inc == null) {
                        option = Console.readInteger("Option not available! Please choose an expense type");
                    } else {
                        return inc;
                    }
                    break;
            }
        }
    }
    
}

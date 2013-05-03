/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.ExpenseTypeController;
import eapli.util.Console;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseTypeUI extends BasicUI {

    ExpenseTypeController pController = new ExpenseTypeController();
    
    public ExpenseTypeUI() {}
    
    @Override
    public String getTitle() {
        return "REGISTER EXPENSE TYPE";
    }
        
    @Override
    public BasicController getController() {
        return pController;
    }

    @Override
    public void getBody() {
        System.out.println("Expense types list:");
        System.out.println(pController.ExpenseTypeList(false));
        DataRequest();
    }
    
    private void DataRequest() {
        while (true) {
            String pName = Console.readLine("Name:");
            String pLongName = Console.readLine("Long Name:");
            if (pController.RegisterExpenseType(pName, pLongName)) {
                System.out.println("Expense type added!\n");
                break;
            } else {
                System.out.println("Expense type name already exist. Please choose another!");
            }
        }
    }

}

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
            String pDescription = Console.readLine("Description:");
            if (pController.RegisterExpenseType(pDescription)) {
                System.out.println("Expense type added!\n");
                break;
            } else {
                System.out.println("Expense type description already exist. Please choose another!");
            }
        }
    }

}

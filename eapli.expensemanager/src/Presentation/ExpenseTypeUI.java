/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;
import eapli.util.Console;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseTypeUI {

    ExpenseTypeController pController = new ExpenseTypeController();
    
    public ExpenseTypeUI() {}
    
    public void mainLoop() {
        while (true) {
            System.out.println("\n* * *  MANAGE EXPENSE TYPES  * * *");

            System.out.println("\nExpense types list:");
            System.out.println(pController.ExpenseTypeList(false));

            System.out.println("1. Add an expense type");
            System.out.println("0. Back\n");
        
            int option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0: 
                    return;
                case 1: 
                    DataRequest();
                    break;
            }
        }
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

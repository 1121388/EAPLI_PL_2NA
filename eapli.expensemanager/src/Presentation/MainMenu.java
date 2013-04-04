/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Presentation.*;
import eapli.util.Console;


/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {
    public void mainLoop() {
        System.out.println("===================");
        System.out.println("  EXPENSE MANAGER  ");
        System.out.println("===================\n");
        
        System.out.println("1. Register an expense");
        System.out.println("2. Settings");
        System.out.println("5. Monthy expenses");
        System.out.println("0. Exit\n\n");
        
        int option = Console.readInteger("Please choose a option");
        switch (option) {
            case 0: 
                System.out.println("bye bye ...");
                return;
            case 1: 
                ExpenseRegisterUI ui1 = new ExpenseRegisterUI();
                ui1.mainLoop();
                break;
            case 2: 
                Settings();
                break;
            case 5: 
                ExpensesMonthlyUI ui5 = new ExpensesMonthlyUI();
                ui5.mainLoop();
                break;          
        }
    }

    public void Settings() {
        System.out.println("====================");
        System.out.println("      Settings      ");
        System.out.println("====================\n");

        System.out.println("1. Initialize Balance");
        System.out.println("0. Back to main menu\n\n");

        int option = Console.readInteger("Please choose a option");
        switch (option) {
            case 0: 
                mainLoop();
            case 1:
//                InitializeBalanceUI ui = new InitializeBalanceUI();
//                ui.InitializeBalance();
//                mainLoop();
//                break;
        }
    }
    
}

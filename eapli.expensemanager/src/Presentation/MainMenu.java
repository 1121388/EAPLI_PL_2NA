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
        while (true) {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
            System.out.println("1. Register an expense");
            System.out.println("2. Expenses of the Week");
            System.out.println("3. Define types expense");
            System.out.println("4. Define types payments");
            //System.out.println("5. Preview monthly expenses"); sempre visivel
            System.out.println("5. Consultation monthly expenses");
            System.out.println("6. Define income types");
            System.out.println("7. Register entrie income");
            System.out.println("8. Settings");
            System.out.println("0. Exit\n\n");
            BalanceController bController = new BalanceController();
            System.out.println("Actual Balance: " + bController.visualizarSaldo() + "\n");


            String option1 = Console.readLine("Please choose an option:");
            char option = option1.charAt(0);
            switch (option) {
                case '0':
                    System.out.println("bye bye ...");
                    return;
                case '1':
                    ExpenseRegisterUI ui1 = new ExpenseRegisterUI();
                    ui1.mainLoop();
                    break;
                case '2':
                    //ExpensesOfTheWeekUI ui4 = new ExpensesOfTheWeekUI();
                    //ui4.mainLoop();
                    break;
                case '3':
                    ExpenseTypeUI ui3 = new ExpenseTypeUI();
                    ui3.show();
                    break;
                case '4':
                    PaymentTypeUI ui2 = new PaymentTypeUI();
                    ui2.show();
                    break;
                case '5':
                    ExpensesMonthlyUI ui5 = new ExpensesMonthlyUI();
                    ui5.mainLoop();
                    //System.out.println("Not Finished!!!");
                    break;
                case '6':
                    IncomeTypeRegisterUI ui6 = new IncomeTypeRegisterUI();
                    ui6.mainLoop();
                    break;
                case '7':
                    IncomeRegisterUI ui7 = new IncomeRegisterUI();
                    ui7.mainLoop();
                    break;
                case '8':
                    Settings();
                    break;
                default:
                    System.out.println("Invalid Option. Please choose an option:\n");
                    break;
            }
        }
    }

    public void Settings() {
        while (true) {
            System.out.println("====================");
            System.out.println("      Settings      ");
            System.out.println("====================\n");

            System.out.println("1. Initialize Balance");
            System.out.println("0. Back to main menu\n\n");

            int option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:
                    return;
                case 1:
                    InitializeBalanceUI ui = new InitializeBalanceUI();
                    ui.InitializeBalance();
                    return;

            }
        }
    }
}

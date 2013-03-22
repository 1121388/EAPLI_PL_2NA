/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

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
        System.out.println("0. Exit\n\n");
        
        int option = Console.readInteger("Please choose a option");
        switch (option) {
            case 0: 
                System.out.println("bye bye ...");
                return;
            case 1: 
                ExpenseRegisterUI ui = new ExpenseRegisterUI();
                ui.mainLoop();
                break;
            case 2: 
                Settings();
                break;
        }
    }
    public void Settings() {
        System.out.println("====================");
        System.out.println("      Settings      ");
        System.out.println("====================\n");

        System.out.println("1. ");
        System.out.println("0. Back to main menu\n\n");

        int option = Console.readInteger("Please choose a option");
        switch (option) {
            case 0: 
                mainLoop();
    }
    }
    
}

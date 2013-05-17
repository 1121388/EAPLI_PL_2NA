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
        while (true) {
//            System.out.println("===================");
//            System.out.println("  EXPENSE MANAGER  ");
//            System.out.println("===================\n");
            System.out.println(formatTitle("EXPENSE MANAGER"));
            System.out.println("1. Register an expense");
            System.out.println("2. Define types expense");
            System.out.println("3. Define types payments");
            System.out.println("4. Consultation monthly expenses");
            System.out.println("5. Define income types");
            System.out.println("6. Register entrie income");
            System.out.println("7. Establishment of savings");
            System.out.println("8. Definition of Limit Type");
            System.out.println("9. Definition of Limit");
            System.out.println("10. Settings");
            System.out.println("0. Exit\n\n");
        
            Integer option1 = Console.readInteger("Please choose an option:");
            
            switch (option1) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    ExpenseRegisterUI ui1 = new ExpenseRegisterUI();
                    ui1.show();
                    break;
                case 2:
                    ExpenseTypeUI ui2 = new ExpenseTypeUI();
                    ui2.show();
                    break;
                case 3:
                    PaymentTypeUI ui3 = new PaymentTypeUI();
                    ui3.show();
                    break;
                case 4:
                    ExpensesMonthlyUI ui4 = new ExpensesMonthlyUI();
                    ui4.show();
                    break;
                case 5:
                    IncomeTypeRegisterUI ui5 = new IncomeTypeRegisterUI();
                    ui5.show();
                    break;
                case 6:
                    IncomeRegisterUI ui6 = new IncomeRegisterUI();
                    ui6.show();
                    break;
                case 7:
                    SavingGoalUI ui7 = new SavingGoalUI();
                    ui7.show();
                    break;
                case 8:
                    LimitTypeUI ui8 = new LimitTypeUI();
                    ui8.show();
                    break;
                case 9:
                    LimitUI ui9 = new LimitUI();
                    ui9.show();
                    break;
                case 10:
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
//            System.out.println("====================");
//            System.out.println("      Settings      ");
//            System.out.println("====================\n");
            System.out.println(formatTitle("Settings"));
            System.out.println("1. Initialize Balance");
            System.out.println("0. Back to main menu\n\n");

            int option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:
                    return;
                case 1:
                    InitializeBalanceUI ui = new InitializeBalanceUI();
                    ui.show();
                    return;

            }
        }
    }
    
    private String formatTitle(String titulo) {
        int pEspacamento = 50;
        String pTitulo = titulo;
        String pResultado = " +";
        if (pTitulo.length() + 2 > pEspacamento)
            pEspacamento = pTitulo.length() + 2;
        for (int i = 0; i < pEspacamento; i++) {
            pResultado += "-";
        }
        pResultado += "+\n | ";
        int pEspacosEsquerda = (int)((pEspacamento - pTitulo.length() - 2) / 2);
        int pEspacosDireita = pEspacamento - pEspacosEsquerda - pTitulo.length() - 1;            
        for (int i = 0; i < pEspacosEsquerda; i++) {
            pResultado += " ";
        }
        pResultado += pTitulo;
        for (int i = 0; i < pEspacosDireita; i++) {
            pResultado += " ";
        }
        pResultado += "|\n +";
        for (int i = 0; i < pEspacamento; i++) {
            pResultado += "-";
        }
        pResultado += "+";
        return pResultado;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpensesMonthlyController;
import Model.Expense;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adao
 */
public class ExpensesMonthlyUI {
        public void mainLoop() {
        System.out.println("* * *  CONSULTA DE GASTOS MENSAIS  * * *\n");
        
        String what = Console.readLine("Introduza data (formato MM/AAAA):");
        String[] dados = what.split("/");
        
        ExpensesMonthlyController controller = new ExpensesMonthlyController();
                        
        List<String> lista = controller.consultaDadosMensais(dados[0], dados[1]);
                
        for(int i=0; i<lista.size(); i++)
        {
            System.out.println(lista.get(i).toString());
        }
                  
        new java.util.Scanner(System.in).nextLine();
        System.out.flush();
        MainMenu ui1 = new MainMenu();
        ui1.mainLoop();
    }
}

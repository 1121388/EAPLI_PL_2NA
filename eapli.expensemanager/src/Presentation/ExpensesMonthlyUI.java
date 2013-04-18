/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpensesMonthlyController;
import eapli.util.Console;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.TimeZone;
/**
 *
 * @author adao <1030066>
 */
public class ExpensesMonthlyUI {
        public void mainLoop() {
        System.out.println("***  5. CONSULTA DE GASTOS MENSAIS   ***\n");
        
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        int currentYear = localCalendar.get(Calendar.YEAR);
        int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
        
        // Colocar uma data por defeito. (adaoss)
        String what = Console.readLine("Introduza data [Formato MM/AAAA] [Defeito: "+currentMonth+"/"+currentYear+"] : ");
        String[] dados = new String[2];
        if ( what.toString().trim().equals("")) {
            dados[0] = Integer.toString(currentMonth);
            dados[1] = Integer.toString(currentYear);
        } else {
             dados = what.split("/");            
        }
        
        ExpensesMonthlyController controller = new ExpensesMonthlyController();
        
                        
        List<String> lista = controller.consultaDadosMensais(dados[0], dados[1]);
                
        for(int i=0; i<=lista.size(); i++)
        {
            System.out.println(lista.get(i).toString());
        }
                  
        System.out.println("Pressione «enter» para regressar ao menu principal.");
        new java.util.Scanner(System.in).nextLine();
        System.out.flush();
        MainMenu ui1 = new MainMenu();
        ui1.mainLoop();
    }
        
        
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.ExpenseTypeController;
import Controllers.ExpensesMonthlyController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;
/**
 *
 * @author adao <1030066>
 */
public class ExpensesMonthlyUI extends BasicUI {

    ExpenseTypeController pController = new ExpenseTypeController();
    
    public ExpensesMonthlyUI() {}
    
    @Override
    public String getTitle() {
        return "CONSULTA DE GASTOS MENSAIS";
    }
        
    @Override
    public BasicController getController() {
        return pController;
    }

    @Override
    public void getBody() {
        mainLoop();
    }
    
    public void show() {
        mainLoop();
    }
    
    public void mainLoop() {        
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        int currentYear = localCalendar.get(Calendar.YEAR);
        int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
        
        // Colocar uma data por defeito. (adaoss)
        String what = Console.readLine("Introduza data [MM/AAAA - "+currentMonth+"/"+currentYear+"] : ");
        String[] dados = new String[2];
        if ( what == null || what.toString().trim().equals("")) {
            dados[0] = Integer.toString(currentMonth);
            dados[1] = Integer.toString(currentYear);
        } else {
             dados = what.split("/");            
        } 
        
        localCalendar.set(currentYear, currentMonth, 1);
        Date inicio = localCalendar.getTime();
        localCalendar.add(Calendar.DAY_OF_MONTH, 30);
        Date fim = localCalendar.getTime();
        
        ExpensesMonthlyController controller = new ExpensesMonthlyController();             
        HashMap<String,BigDecimal> lista = controller.consultaDadosMensais(inicio, fim);
        
        if ( lista == null || lista.size() == 0 ) {
           System.out.println("Nenhuma despesa registada.");
        } else {
            Set keys = lista.keySet();

             for (Iterator i = keys.iterator(); i.hasNext();) 
             {
                 String key = (String) i.next();
                 BigDecimal value = (BigDecimal) lista.get(key);
                  System.out.println("          " + key + " ) " + value);   
             }
        }
                  
        System.out.println("Pressione «enter» para regressar ao menu principal.");
        new java.util.Scanner(System.in).nextLine();
        System.out.flush();
    }        
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;

/**
 *
 * @author i111051
 */
public abstract class BasicUI {
    
    void getHeader() {
        System.out.println(formatTitle() + "\n");
        BasicController bController = getController();
        System.out.println("    Week Expenses: " + bController.currentWeekExpenses().toString());
        System.out.println("   Month Expenses: " + bController.currentWeekExpenses().toString());
        System.out.println("          Balance: " + bController.currentBalance().toString());
    }
    
    private String formatTitle() {
        int pEspacamento = 50;
        String pTitulo = getTitle();
        String pResultado = " +";
        for (int i = 0; i < pEspacamento; i++) {
            pResultado += "-";
        }
        pResultado += "+\n | ";
        if (!(pTitulo.length() + 2 > pEspacamento)) {
            int pEspacosEsquerda = (int)((pEspacamento - pTitulo.length() - 2) / 2);
            int pEspacosDireita = pEspacamento - pEspacosEsquerda - pTitulo.length() - 1;            
            /*for (int i = 0; i < pEspacamento - 1 - pTitulo.length(); i++) {
                pResultado += " ";
            }*/
            for (int i = 0; i < pEspacosEsquerda; i++) {
                pResultado += " ";
            }
            pResultado += pTitulo;
            for (int i = 0; i < pEspacosDireita; i++) {
                pResultado += " ";
            }
        }
        pResultado += "|\n +";
        for (int i = 0; i < pEspacamento; i++) {
            pResultado += "-";
        }
        pResultado += "|";
        return pResultado;
    }
    
    public abstract String getTitle();
    
    public abstract BasicController getController();
}

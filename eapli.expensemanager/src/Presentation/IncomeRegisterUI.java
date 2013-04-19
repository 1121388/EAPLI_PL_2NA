/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import Model.*;
import Presentation.*;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/* @author jfoliveira
 */
class IncomeRegisterUI extends BasicUI {

    private IncomeRegisterController controller;

    public IncomeRegisterUI() {

        controller = new IncomeRegisterController();
    }

    public void mainLoop() {


        System.out.println("* * *  REGISTER AN Income  * * *\n");
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);

        IncomeTypeSelectorUI SelecionarTipoRendimento = new IncomeTypeSelectorUI();
        IncomeType incomeType = SelecionarTipoRendimento.SelectIncomeType(false);
        if (incomeType == null) {
            return;
        }

        controller.registerIncome(what, date, amount, incomeType);
        System.out.println("income recorded.");



    }

    @Override
    public void getBody() {
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);

        IncomeTypeSelectorUI SelecionarTipoRendimento = new IncomeTypeSelectorUI();
        IncomeType incomeType = SelecionarTipoRendimento.SelectIncomeType(false);
        if (incomeType == null) {
            return;
        }

        controller.registerIncome(what, date, amount, incomeType);
        System.out.println("income recorded.");
    }

    @Override
    public String getTitle() {
        return "* * *  REGISTER AN Income  * * *";
    }

    @Override
    public BasicController getController() {
        return controller;
    }
}

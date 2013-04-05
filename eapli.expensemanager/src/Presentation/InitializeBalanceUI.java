/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.InitializeBalanceController;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class InitializeBalanceUI {

    public void InitializeBalance() {

        Scanner in = new Scanner(System.in);
        BigDecimal valor;
        
        try {
            System.out.print("Insert value: ");
            valor=in.nextBigDecimal();
            
            InitializeBalanceController control = new InitializeBalanceController();
            control.InitializeBalance(valor);

            System.out.println("Success Initial Balance set to " + valor.setScale(2).toPlainString());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect Value please try again!");
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Value please try again!");
        }
    }
}

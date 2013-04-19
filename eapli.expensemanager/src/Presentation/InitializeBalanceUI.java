/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BasicController;
import Controllers.InitializeBalanceController;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class InitializeBalanceUI extends BasicUI{

    private InitializeBalanceController initBalanceControl = new InitializeBalanceController();
    
    @Override
    public void getBody() {
        
        Scanner in = new Scanner(System.in);
        BigDecimal valor;
        try {
            
            System.out.print("Insert value: ");
            valor=in.nextBigDecimal();
            initBalanceControl.InitializeBalance(valor);
            System.out.println("Success Initial Balance set to " + valor.setScale(2).toPlainString() + "\n");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect Value please try again!" + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Value please try again!" + "\n");
        }
    }

    @Override
    public String getTitle() {
        return "Initialize Balance";
    }

    @Override
    public BasicController getController() {
        return initBalanceControl;
    }
}

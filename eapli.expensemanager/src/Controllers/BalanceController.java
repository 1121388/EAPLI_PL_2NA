/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ChekingAccount;

/**
 *
 * @author pseeno
 */
public class BalanceController {

    Model.ChekingAccount conta = new ChekingAccount();

    public double visualizarSaldo() {

        return conta.getSaldo();

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ChekingAccount;

/**
 *
 * @author psereno
 */
public class ChekinkAccountContoller {
  
  ChekingAccount conta = new ChekingAccount();
  
  public void visualizarSaldo(){
  
  conta.getSaldo();
  
  }  
  
}

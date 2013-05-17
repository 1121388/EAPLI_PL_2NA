/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ChekingAccount;


/**
 *
 * @author SofiaLoboLima
 */
public interface ChekingAccountRepository {
    
    public void SaveChekingAccount(ChekingAccount aChekingAccount);
    
    public ChekingAccount GetChekingAccount();
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.ChekingAccount;
import Persistence.ChekingAccountRepository;

/**
 *
 * @author SofiaLoboLima
 */
public class ChekingAccountRepositoryImpl implements ChekingAccountRepository {

    private static ChekingAccount checkAccount;
    
    //<editor-fold defaultstate="collapsed" desc="SINGLETON">
    private static ChekingAccountRepository pRepository = null;
    public static ChekingAccountRepository GetInstance() {
        if (pRepository == null) {
            pRepository = new ChekingAccountRepositoryImpl();
        }
        return pRepository;
    }
    //</editor-fold>

    @Override
    public void SaveChekingAccount(ChekingAccount aChekingAccount) {
        checkAccount = aChekingAccount;
    }

    @Override
    public ChekingAccount GetChekingAccount() {
        if (checkAccount == null) {
            checkAccount = new ChekingAccount("1","2NA");
        }
        return checkAccount;
    }
}

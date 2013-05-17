/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ChekingAccount;
import Persistence.ChekingAccountRepository;
import Persistence.InMemory.ChekingAccountRepositoryImpl;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author Marco
 */
public class InitializeBalanceController extends BasicController{
    
    public void InitializeBalance(BigDecimal valor){ 
        
//            BalanceRepository repo = BalanceRepository.getInstance();
//            repo.setBalance(valor);     
        
        ChekingAccount chekAc=PersistenceFactory.buildPersistenceFactory().chekingAccountRepository().GetChekingAccount();
        chekAc.setSaldoInicial(valor);
    }
    
}

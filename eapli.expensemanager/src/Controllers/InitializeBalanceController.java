/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ChekingAccount;
import Persistence.ChekingAccountRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author Marco
 */
public class InitializeBalanceController extends BasicController{
    
    private ChekingAccountRepository pRepository = PersistenceFactory.buildPersistenceFactory().chekingAccountRepository();
    
    public void InitializeBalance(BigDecimal valor){ 
        
//            BalanceRepository repo = BalanceRepository.getInstance();
//            repo.setBalance(valor);     
        
        ChekingAccount chekAc=pRepository.GetChekingAccount();
        chekAc.setSaldoInicial(valor);
        pRepository.SaveChekingAccount(chekAc);
        
    }
    
}

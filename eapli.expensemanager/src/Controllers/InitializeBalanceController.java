/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Persistence.BalanceRepository;
import java.math.BigDecimal;

/**
 *
 * @author Marco
 */
public class InitializeBalanceController {
    
    public void InitializeBalance(BigDecimal valor){
        
            BalanceRepository repo = BalanceRepository.getInstance();
            repo.setBalance(valor);
               
        
    }
    
}

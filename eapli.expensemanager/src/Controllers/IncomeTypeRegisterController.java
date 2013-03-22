/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.IncomeType;
import Persistence.IncomeTypeRepository;
/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterController {

    public void registerIncomeType(String description) {
        IncomeType incType = new IncomeType(description);
        
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(incType);
    }
    
}

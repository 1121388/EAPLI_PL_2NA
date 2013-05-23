/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceFactory;
import java.util.List;
/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterController extends BasicController {


    
    private IncomeTypeRepository repo = PersistenceFactory.buildPersistenceFactory().incomeTypeRepository(); //alterado
     

    public void registerIncomeType(String shortName, String description) {
        
        if (repo.getIncomeTypeByDescription(description)==null){
            
        }
        IncomeType incType = new IncomeType(shortName,description);
        
        
        repo.SaveIncomeType(incType);
    }
    
    public List<IncomeType> getIncomeTypeList(){
        
        return repo.getIncomeTypes();
    }
    public List<String> getIncomeTypeListStrings(){
        
        return repo.getIncomeTypesStrings();
    }
    
    public IncomeType getIncomeTypeByDescription(String desc){
       
        return repo.getIncomeTypeByDescription(desc);

    }
    
    public boolean existsIncomeTypeByDescription(String description){
        
            if (getIncomeTypeByDescription(description)==null)
                return false;
            else
                return true;
    }
    
}

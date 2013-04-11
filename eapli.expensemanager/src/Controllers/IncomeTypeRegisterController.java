/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.List;
/**
 *
 * @author Nuno
 */
public class IncomeTypeRegisterController {

    private IncomeTypeRepository repo;
    
    public IncomeTypeRegisterController() {
        
        repo = IncomeTypeRepository.getInstance();
        
    }    
    
    

    public void registerIncomeType(String description) {
        
        if (repo.getIncomeTypeByDescription(description)==null){
            
        }
        IncomeType incType = new IncomeType(description);
        
        
        repo.save(incType);
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

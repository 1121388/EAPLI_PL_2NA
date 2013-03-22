/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Persistence;
import Model.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nuno
 */
public class IncomeTypeRepository {
    
    
        
    private static List<IncomeType> listIncomeType= new ArrayList<IncomeType>();

    public IncomeTypeRepository() {}
    
    public void save(IncomeType inc)
    {
        if (inc==null) throw new IllegalArgumentException();
        listIncomeType.add(inc);
      
    }
    
    public List<IncomeType> getIncomeTypes(){
        return listIncomeType;
    }
    
}

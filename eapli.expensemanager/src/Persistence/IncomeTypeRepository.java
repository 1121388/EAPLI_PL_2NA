/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Persistence;
import Model.IncomeType;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nuno
 */
public interface IncomeTypeRepository {     //alterado de class para interface
    
    
    
    public boolean SaveIncomeType(IncomeType inc);
    public String IncomeTypeList(boolean aNumberedList);
    public List<IncomeType> IncomeTypeObjectList();
    public IncomeType GetIncomeType(int aNrObject);    
    public List<IncomeType> getIncomeTypes();
    public List<String> getIncomeTypesStrings();
    public IncomeType getIncomeTypeByDescription(String desc);
    
    
//    private static IncomeTypeRepository uniqueInstance = null;
//    
//    private static List<IncomeType> listIncomeType = new ArrayList<IncomeType>();
//
//    
//    private IncomeTypeRepository() {          
//    
//    }
//    
//    public static IncomeTypeRepository getInstance(){
//        
//        if (uniqueInstance == null )
//            uniqueInstance = new IncomeTypeRepository();
//        
//        return uniqueInstance;        
//    }
//    
//    
//    
//    public void save(IncomeType inc)
//    {
//        if (inc==null) throw new IllegalArgumentException();
//        listIncomeType.add(inc);      
//    }
//    
//    
//    public List<IncomeType> getIncomeTypes(){
//        return listIncomeType;
//    }
//    
//    public List<String> getIncomeTypesStrings(){
//        
//        List<String> list=new ArrayList<String>();
//        
//        for (IncomeType inc:listIncomeType)
//            list.add(inc.getDescription());
//        
//        return list;
//    }
//    
//    public IncomeType getIncomeTypeByDescription(String desc){
//       
//        for (IncomeType inc:listIncomeType)
//        {
//            if (inc.getDescription().equals(desc))
//                return inc;
//                
//        }
//
//    return null;
//
//    }
    
}

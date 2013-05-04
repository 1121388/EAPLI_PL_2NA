/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Limit;
import Model.LimitType;
import java.util.List;

/**
 *
 * @author Hugo Silva
 */
public interface LimitTypeRepository {
    
    // class member
    /*
    private static LimitTypeRepository repository = null;
    private List<LimitType> listLimit= new ArrayList<LimitType>();

    private LimitTypeRepository() {}
    
    public static LimitTypeRepository GetInstance() {
        if (repository == null)
            repository = new LimitTypeRepository();
        return repository;
    }
    
    public List<LimitType> getListLimit(){
        return listLimit;
    }
    
    public void save(LimitType l)
    {
        if (l==null) throw new IllegalArgumentException();
        listLimit.add(l);
    }
    */
    public List<LimitType> getListLimit();
    public LimitType save(LimitType l);
}

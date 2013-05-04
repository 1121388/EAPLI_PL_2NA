/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Limit;
import java.util.List;

/**
 *
 * @author Hugo Silva
 */
public interface LimitRepository {
    public List<Limit> getListLimit();
    public Limit save(Limit l);
/*    
    // class member
    private static LimitRepository repository = null;
    private List<Limit> listLimit= new ArrayList<Limit>();

    private LimitRepository() {}
    
    public static LimitRepository GetInstance() {
        if (repository == null)
            repository = new LimitRepository();
        return repository;
    }
    
    public List<Limit> getListLimit(){
        return listLimit;
    }
    
    public void save(Limit l)
    {
        if (l==null) throw new IllegalArgumentException();
        listLimit.add(l);
      
    }
*/ 
}

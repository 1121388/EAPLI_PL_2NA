/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Limit;
import Persistence.LimitRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arocha
 */
public class LimitRepositoryImpl implements LimitRepository {

    private static LimitRepository repository = null;
    private List<Limit> listLimit= new ArrayList<Limit>();
    
    public static LimitRepository GetInstance() {
        if (repository == null)
            repository = new LimitRepositoryImpl();
        return repository;
    }
    
    @Override
    public List<Limit> getListLimit(){
        return listLimit;
    }
    
    @Override
    public Limit save(Limit l)
    {  
        AddLimit(l);
        return l;
    }
    
    private void AddLimit(Limit a) {
        listLimit.add(a);
    }
}

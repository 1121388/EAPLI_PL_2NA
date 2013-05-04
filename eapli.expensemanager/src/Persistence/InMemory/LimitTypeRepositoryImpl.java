/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.LimitType;
import Persistence.LimitTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arocha
 */
public class LimitTypeRepositoryImpl implements LimitTypeRepository {

    private static LimitTypeRepository repository = null;
    private List<LimitType> listLimit= new ArrayList<LimitType>();
    
    public static LimitTypeRepository GetInstance() {
        if (repository == null)
            repository = new LimitTypeRepositoryImpl();
        return repository;
    }
    
    @Override
    public List<LimitType> getListLimit(){
        return listLimit;
    }
    
    @Override
    public LimitType save(LimitType l)
    {       
        AddLimitType(l);
        return l;
    }
    
    private void AddLimitType(LimitType a) {
        listLimit.add(a);
    }
}

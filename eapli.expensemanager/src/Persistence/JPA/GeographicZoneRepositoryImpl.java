/**
 *
 * @author adaoss <1030066>
 */

package Persistence.JPA;

import Model.GeographicZone;
import Persistence.GeographicZoneRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class GeographicZoneRepositoryImpl extends JpaRepository<GeographicZone, String> implements GeographicZoneRepository {

    public GeographicZone findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();
        assert em != null;

        GeographicZone Record;
        Query q = em.createQuery("SELECT et FROM GeographicZone et WHERE et.id = :type").setParameter("type", key);
        try {
            Record = (GeographicZone) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            Record = new GeographicZone(description);
            save(Record);           
        }
        return Record;
    }   

    @Override
    public String GeographicZoneList(boolean aNumberedList) {
        String List = "1-xx";
        return List;
    }

    @Override
    public List<GeographicZone> GeographicZoneObjectList() {
        return null;
    }
        
    @Override
    public GeographicZone GetGeographicZone(int aNrObject) {
        return null;
    }
    
    @Override
    public boolean CheckIfNotExist(GeographicZone aExpenseType) {
        return false;
    }
}

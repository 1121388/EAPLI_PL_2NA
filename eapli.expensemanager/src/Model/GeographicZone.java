/*
 * @author: adaoss <1030066>
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class GeographicZone implements Serializable{
    
    @Id
    String description;
    
    
    protected GeographicZone() {}

    public GeographicZone(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public String toString() {        
         return "Geographic zone: " + description ;
    }
    
    
    
    
    
}

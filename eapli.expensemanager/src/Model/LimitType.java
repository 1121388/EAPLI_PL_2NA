/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Hugo Silva
 */
@Entity
public class LimitType implements Serializable {
    
    @Id
    private Integer id;
    private String name;
    
    public LimitType() {}
    
    public LimitType(Integer i, String n) {
        this.id = i;
        this.name = n;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 *
 * @author Hugo Silva
 */
@Entity
public class Limit implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @OneToOne
    @JoinColumn(name="type_id")        
    LimitType type;
    
    private BigDecimal value_yellow;
    private BigDecimal value_red;
    
    protected Limit() {}
    
    public Limit(LimitType t, BigDecimal v1, BigDecimal v2){
        this.type = t;
        this.value_yellow = v1;
        this.value_red = v2;
    }

    /**
     * @return the type
     */
    public LimitType getType() {
        return type;
    }

    /**
     * @return the value_yellow
     */
    public BigDecimal getValue_yellow() {
        return value_yellow;
    }

    /**
     * @return the value_red
     */
    public BigDecimal getValue_red() {
        return value_red;
    }
}

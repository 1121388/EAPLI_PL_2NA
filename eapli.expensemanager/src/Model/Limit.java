/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Hugo Silva
 */
public class Limit {
    
    LimitType type;
    BigDecimal value_yellow;
    BigDecimal value_red;
    
    public Limit(LimitType t, BigDecimal v1, BigDecimal v2){
        this.type = t;
        this.value_yellow = v1;
        this.value_yellow = v2;
    }
}

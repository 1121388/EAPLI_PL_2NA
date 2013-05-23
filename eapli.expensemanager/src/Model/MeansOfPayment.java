/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Abilio
 */
@Entity
public class MeansOfPayment implements Serializable {
    
    @Id
    @GeneratedValue
    @OneToOne
    Cash paymenType;
    int nCheck;

    public MeansOfPayment() {
    }
    
    public MeansOfPayment(Cash paymenType){
        this.paymenType = paymenType;
    }
    /*
    public MeansOfPayment(PaymentType paymenType, int nCheck){
        this.nCheck = nCheck;
        this.paymenType = paymenType;
    }
    */
}

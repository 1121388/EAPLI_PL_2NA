/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Abilio
 */
public class MeansOfPayment {
    
    PaymentType paymenType;
    int nCheck;
    
    public MeansOfPayment(PaymentType paymenType){
        this.paymenType = paymenType;
    }
    public MeansOfPayment(PaymentType paymenType, int nCheck){
        this.nCheck = nCheck;
        this.paymenType = paymenType;
    }

}

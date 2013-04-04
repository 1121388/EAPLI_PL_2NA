/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentType;
import Persistence.PaymentTypeRepository;

/**
 *
 * @author Abilio
 */
public class PaymentTypeController {
    
    private PaymentTypeRepository repository = new PaymentTypeRepository();
    
    public PaymentTypeController() {}
    
    public void registerPaymentType(String description) {
        PaymentType paymentType = new PaymentType(description);
        repository.AddPaymentType(paymentType);
    }
    
    public String listPaymentTypeList() {
        return repository.listPaymentTypeList();
    }   
}

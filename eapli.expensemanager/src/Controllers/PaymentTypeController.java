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
    
    public void registerPaymentType(String alias, int cod_sys) {
        PaymentType paymentType = new PaymentType(alias);
        repository.AddPaymentType(paymentType);
    }
    
    public String listPaymentTypeList() {
        return repository.listPaymentTypeList();
    }   
}

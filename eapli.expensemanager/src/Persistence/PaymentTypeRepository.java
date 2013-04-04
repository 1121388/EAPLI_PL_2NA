 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abilio
 */
public class PaymentTypeRepository {
    
    private static List<PaymentType> PaymentTypeList = new ArrayList<PaymentType>();
    
    public PaymentTypeRepository() {}
    
    public void AddPaymentType(PaymentType paymentType) {
        PaymentTypeList.add(paymentType);
    }
    
    public String listPaymentTypeList() {
        String list = "\nPayment types list:\n";
            for (int i = 0; i < PaymentTypeList.size(); i++) {
                list = list + (i + 1) + " -> " + PaymentTypeList.get(i).GetDescription() + "\n";
            }
        return list;
    }
  
    public PaymentType GetPaymentType(int pos) {
        return PaymentTypeList.get(pos - 1);
    }
}

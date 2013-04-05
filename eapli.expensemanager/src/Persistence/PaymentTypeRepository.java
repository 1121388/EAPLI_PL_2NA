package Persistence;

import Model.PaymentType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i080649
 */
public class PaymentTypeRepository {
    
    //private static PaymentTypeRepository uniquePaymentTypeRepository = new PaymentTypeRepository();
    private static List<PaymentType> PaymentTypeList = new ArrayList<PaymentType>();
    
    //private PaymentTypeRepository() {}
    public PaymentTypeRepository() {}
    
    public void AddPaymentType(PaymentType paymentType) {
        PaymentTypeList.add(paymentType);
    }
    
    public String listPaymentTypeList() {
        String list = "\nPayment types list:\n";
            for (int i = 0; i < PaymentTypeList.size(); i++) {
                list = list + (i + 1) + " -> " + PaymentTypeList.get(i).getAlias() + "\n";
            }
        return list;
    }
  
    public PaymentType GetPaymentType(int pos) {
        return PaymentTypeList.get(pos - 1);
    }
}

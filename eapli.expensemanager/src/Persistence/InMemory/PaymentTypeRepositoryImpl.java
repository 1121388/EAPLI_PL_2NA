/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Cash;
import Persistence.PaymentTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abilio
 */
public class PaymentTypeRepositoryImpl implements PaymentTypeRepository{

    private static List<Cash> PaymentTypeList = new ArrayList<Cash>();
    
    @Override
    public void AddPaymentType(Cash paymentType) {
        PaymentTypeList.add(paymentType);
    }

    @Override
    public String listPaymentTypeList() {
         String list = "\nPayment types list:\n";
            for (int i = 0; i < PaymentTypeList.size(); i++) {
                list = list + (i + 1) + " -> " + PaymentTypeList.get(i).getAlias() + "\n";
            }
        return list;
    }

    @Override
    public Cash GetPaymentType(int pos) {
        return PaymentTypeList.get(pos - 1);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jfoliveira
 */
public class IncomeRegisterController extends BasicController {

//    IncomeRepository incomeRepository = IncomeRepository.GetInstance();
//    IncomeTypeRepository incomeTypeRepository = IncomeTypeRepository.getInstance();
    IncomeTypeRepository incomeTypeRepository = PersistenceFactory.buildPersistenceFactory().incomeTypeRepository();

    public List<String> IncomeTypeList() {
        if (IncomeTypeList().isEmpty()) {
            System.out.println("You must define first a type of income");
        }
        return incomeTypeRepository.getIncomeTypesStrings();

    }

    public IncomeRegisterController() {
    }

//    public IncomeType GetIncomeType(int incomeType){
//        return incomeTypeRepository.GetIncomeType(incomeType);
//    }
//    
    public void registerIncome(String what, Date date, BigDecimal amount, IncomeType incomeType) {
        new ChekingAccount().registerIncome(what, date, amount, incomeType);
    }
}

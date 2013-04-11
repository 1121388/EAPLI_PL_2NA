package Model;

import Persistence.BalanceRepository;
import Persistence.ExpenseRepository;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.List;

public class ChekingAccount {

    private BigDecimal saldoatual, tdespesas, treceitas;
    private List<Expense> despesas = ExpenseRepository.GetInstance().getListExpense();
    //private List<Income> receitas = IncomeRepository.;

    //Devolve o saldo atual
    public BigDecimal getSaldo() {

        saldoatual = BalanceRepository.getInstance().getBalance();
        determinaTotalDespesas();
//        determinaTotalrendimento();
        saldoatual.add(treceitas);
        saldoatual.subtract(tdespesas);
        return saldoatual;
    }

    //------------------------------ GET´S -------------------------------------
    //Contentor com as despesas todas 
    public List<Expense> getDespesas() {
        return despesas;
    }

    //Contentor com as receitas todas 
    //public List<Income> getReceitas() {
      //  return receitas;
    //}

    //Total das receitas
//    public BigDecimal getTotalReceitas() {
//        determinaTotalrendimento();
//        return treceitas;
//    }

    //Total das despesas
    public BigDecimal getTotalDespesas() {
        determinaTotalDespesas();
        return tdespesas;
    }

    //-----------------------  Metodos privados --------------------------------
    private void determinaTotalDespesas() {

        for (int i = 0; i < despesas.size(); i++) {
            tdespesas.add((despesas.get(i)).getAmount());
        }
    }

//    private void determinaTotalrendimento() {
//
//        for (int i = 0; i < receitas.size(); i++) {
//            treceitas.add((receitas.get(i)).getAmount());
//        }
//    }
}

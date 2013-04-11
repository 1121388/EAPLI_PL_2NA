package Model;

import Persistence.BalanceRepository;
import Persistence.ExpenseRepository;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ChekingAccount {

    private BigDecimal saldoatual, tdespesas, treceitas;
    private List<Expense> despesas = ExpenseRepository.GetInstance().getListExpense();
    private List<Income> receitas = IncomeRepository.GetInstance().getListIncome();

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

//    Contentor com as receitas todas
    public List<Income> getReceitas() {
        return receitas;
    }
//    Total das receitas

    public BigDecimal getTotalReceitas() {
        determinaTotalrendimento();
        return treceitas;
    }

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

    private void determinaTotalrendimento() {

        for (int i = 0; i < receitas.size(); i++) {
            treceitas.add((receitas.get(i)).getAmount());
        }
    }

    //--------- Método a ser usado pelas funções que necessitem de despesas por periodo de tempo.
    public List<Expense> getExpensesByPeriod(Date start, Date end) {
        List<Expense> _resultado = null;
        int index = despesas.size();

        if (index == 0) {
            return _resultado;
        }

        for (; index > 0; index--) {
            if (despesas.get(index).dateOccurred.after(start) && despesas.get(index).dateOccurred.before(end)) {
                _resultado.add(despesas.get(index));
            }
        }

        return _resultado;
    }

    //----------- Obter a lista de despesas, agrupadas por tipo, de um determinado mês
    public List<Expense> getMonthlyExpenses(Date inicio, Date fim) {
        List<Expense> _resultado = this.getExpensesByPeriod(inicio, fim);



        return _resultado;
    }
}

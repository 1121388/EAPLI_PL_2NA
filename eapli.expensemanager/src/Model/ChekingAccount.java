package Model;

import Persistence.BalanceRepository;
import Persistence.ExpenseRepository;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ChekingAccount {
    
    ExpenseRepository expenseRepository = ExpenseRepository.GetInstance();
    private BigDecimal saldoatual, tdespesas, treceitas;
    private List<Expense> despesas = ExpenseRepository.GetInstance().getListExpense();
    private List<Income> receitas = IncomeRepository.GetInstance().getListIncome();

    //Devolve o saldo atual
    public double getSaldo() {
        saldoatual = BalanceRepository.getInstance().getBalance();
        tdespesas = new BigDecimal(0);
        treceitas = new BigDecimal(0);
        determinaTotalDespesas();
        determinaTotalrendimento();
        saldoatual.add(treceitas);
        saldoatual.subtract(tdespesas);
        Double d = saldoatual.doubleValue();
        return d;
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

    //--------Obter total de despesas da semana
    public BigDecimal getWeekExpenses() {
        /*
        BigDecimal texpenses = null;
        BigDecimal aux = null;

        //----- Obter dias do mês
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date stdate, lstdate;
        stdate = c.getTime();
        c.add(Calendar.DATE, 6);
        lstdate = c.getTime();

        List<Expense> WeekExpenses = (List<Expense>) (Expense) getExpensesByPeriod(stdate, lstdate);

        for (int i = 0; i < 7; i++) {
            texpenses = aux.add(WeekExpenses.get(i).getAmount());
            aux = texpenses;
        }

        System.out.println(texpenses);

        return texpenses;
        */
        return new BigDecimal(10);
    }

    public BigDecimal getMonthExpenses(){return null;}
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
            if (despesas.get(index).getDateOccurred().after(start) && despesas.get(index).getDateOccurred().before(end)) {
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
    
    /*
     * 
     */
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expenseType, MeansOfPayment meansOfPayment) {
        Expense expense = new Expense( what, date, amount, expenseType, meansOfPayment);
        expenseRepository.save(expense);
    }
}

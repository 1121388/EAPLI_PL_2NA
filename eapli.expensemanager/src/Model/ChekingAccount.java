package Model;

import Persistence.BalanceRepository;
import Persistence.ExpenseRepository;
import Persistence.IncomeRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ChekingAccount {
    
    ExpenseRepository expenseRepository = ExpenseRepository.GetInstance();
    IncomeRepository incomeRepository = PersistenceFactory.buildPersistenceFactory().incomeRepository();
    private BigDecimal saldoatual, tdespesas, treceitas;
//    private double dtdespesas=0, dtreceitas=0, dsaldoatual=0;
    private List<Expense> despesas = ExpenseRepository.GetInstance().getListExpense();
    //private List<Income> receitas = IncomeRepository.GetInstance().getListIncome();
    private List<Income> receitas =PersistenceFactory.buildPersistenceFactory().incomeRepository().IncomeObjectList();

    //Devolve o saldo atual
    public double getSaldo() {
        saldoatual = BalanceRepository.getInstance().getBalance();
        tdespesas = new BigDecimal(0);
        treceitas = new BigDecimal(0);
        determinaTotalDespesas();
        determinaTotalrendimento();
        saldoatual = saldoatual.add(treceitas);
        saldoatual = saldoatual.subtract(tdespesas);
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

    public BigDecimal getMonthExpenses()
    {    
        Calendar cal = Calendar.getInstance();  
        int year = cal.get(cal.YEAR);  
        int month = cal.get(cal.MONTH)+1;
        Date inicio = new Date(year, month, 1);
        Date fim = new Date(year, month, Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));
        List<Expense> despesas = new ChekingAccount().getExpensesByPeriod(inicio, fim);
        BigDecimal amount = BigDecimal.ZERO; 
        
        // Verificar a existência de despesas para o mês pretendido.
        if ( despesas == null) {
            return amount;
        }
        
        for(int i=0; i<despesas.size(); i++)
        {
            amount = amount.add(despesas.get(i).getAmount());
        }
        
        return amount;
    }
    //-----------------------  Metodos privados --------------------------------
    private void determinaTotalDespesas() {

        for (int i = 0; i < despesas.size(); i++) {
            tdespesas=tdespesas.add((despesas.get(i)).getAmount());
        }
    }

    private void determinaTotalrendimento() {

        for (int i = 0; i < receitas.size(); i++) {
            treceitas = treceitas.add((receitas.get(i)).getAmount());
        }
    }

    //--------- Método a ser usado pelas funções que necessitem de despesas por periodo de tempo.
    public List<Expense> getExpensesByPeriod(Date start, Date end) {
        List<Expense> _resultado = null;
        int index = despesas.size();
        if (index == 0) 
            return _resultado;
        

        for (int i=0; i<index;i++) {
            if (despesas.get(i).getDateOccurred().after(start) && despesas.get(i).getDateOccurred().before(end)) {
                _resultado.add(despesas.get(i));
            }
        }

        return _resultado;
    }

    //----------- Obter a lista de despesas, agrupadas por tipo, de um determinado mês (1030066)
    public HashMap<String,BigDecimal> getMonthlyExpenses(Date inicio, Date fim) {
        List<Expense> _resultado = this.getExpensesByPeriod(inicio, fim);

              System.out.println(inicio.toString());
        //System.out.println(lstdate);

        HashMap<String,BigDecimal> _resumo = new HashMap<String, BigDecimal>();
        if ( _resultado != null && _resultado.size() > 0 ) {
            for(int i=0;i<_resultado.size();i++) {
                Expense _temp = _resultado.get(i);
                String _key = _temp.expenseType.GetName();

                if ( _resumo.containsKey(_key)) {
                    BigDecimal _tempvalor =  (BigDecimal)_resumo.get(_key);
                    _tempvalor.add(_temp.getAmount());
                    _resumo.put(_key, _tempvalor);
                } else {
                    _resumo.put(_key, _temp.getAmount());
                }
            }
        }

        return _resumo;
    }
    
    /*
     * 
     */
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expenseType, MeansOfPayment meansOfPayment) {
        Expense expense = new Expense( what, date, amount, expenseType, meansOfPayment);
        expenseRepository.save(expense);
    }
    
     public void registerIncome(String what, Date date, BigDecimal amount, IncomeType incomeType) {
        Income income = new Income( what, date, amount, incomeType);
        incomeRepository.saveIncome(income);
    }
}

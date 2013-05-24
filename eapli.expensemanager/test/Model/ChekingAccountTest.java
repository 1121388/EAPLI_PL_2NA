/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.InitializeBalanceController;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class ChekingAccountTest {
    
    public ChekingAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSaldo method, of class ChekingAccount.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        ChekingAccount instance = new ChekingAccount();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDespesas method, of class ChekingAccount.
     */
    @Test
    public void testGetDespesas() {
        System.out.println("getDespesas");
        ChekingAccount instance = new ChekingAccount();
        List expResult = null;
        List result = instance.getDespesas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getReceitas method, of class ChekingAccount.
     */
    @Test
    public void testGetReceitas() {
        System.out.println("getReceitas");
        ChekingAccount instance = new ChekingAccount();
        List expResult = null;
        List result = instance.getReceitas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalReceitas method, of class ChekingAccount.
     */
    @Test
    public void testGetTotalReceitas() {
        System.out.println("getTotalReceitas");
        ChekingAccount instance = new ChekingAccount();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalReceitas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDespesas method, of class ChekingAccount.
     */
    @Test
    public void testGetTotalDespesas() {
        System.out.println("getTotalDespesas");
        ChekingAccount instance = new ChekingAccount();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalDespesas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekExpenses method, of class ChekingAccount.
     */
    @Test
    public void testGetWeekExpenses() {
        System.out.println("getWeekExpenses");
        ChekingAccount instance = new ChekingAccount();
        BigDecimal expResult = null;
        BigDecimal result = instance.getWeekExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthExpenses method, of class ChekingAccount.
     */
    @Test
    public void testGetMonthExpenses() {
        System.out.println("getMonthExpenses");
        ChekingAccount instance = new ChekingAccount();
        BigDecimal expResult = null;
        BigDecimal result = instance.getMonthExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExpensesByPeriod method, of class ChekingAccount.
     */
    @Test
    public void testGetExpensesByPeriod() {
        System.out.println("getExpensesByPeriod");
        Date start = null;
        Date end = null;
        ChekingAccount instance = new ChekingAccount();
        List expResult = null;
        List result = instance.getExpensesByPeriod(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlyExpenses method, of class ChekingAccount.
     */
    @Test
    public void testGetMonthlyExpenses() {
        System.out.println("getMonthlyExpenses");
        Date inicio = null;
        Date fim = null;
        ChekingAccount instance = new ChekingAccount();
        List expResult = null;
        List result = instance.getMonthlyExpenses(inicio, fim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerExpense method, of class ChekingAccount.
     */
    @Test
    public void testRegisterExpense() {
        System.out.println("registerExpense");
        String what = "";
        Date date = null;
        BigDecimal amount = null;
        ExpenseType expenseType = null;
        MeansOfPayment meansOfPayment = null;
        ChekingAccount instance = new ChekingAccount();
        instance.registerExpense(what, date, amount, expenseType, meansOfPayment);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerIncome method, of class ChekingAccount.
     */
    @Test
    public void testRegisterIncome() {
        System.out.println("registerIncome");
        String what = "";
        Date date = null;
        BigDecimal amount = null;
        IncomeType incomeType = null;
        ChekingAccount instance = new ChekingAccount();
        instance.registerIncome(what, date, amount, incomeType);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of Saldo Inicial
     */        //fail("The test case is a prototype.");

    @Test
    public void testInitBalance() {
        int valor = 15000;
        System.out.println("init bal\nSet->15000");
        InitializeBalanceController inticont = new InitializeBalanceController();
        inticont.InitializeBalance(new BigDecimal(valor));
        ChekingAccount ck = PersistenceFactory.buildPersistenceFactory().chekingAccountRepository().GetChekingAccount();
        BigDecimal expResult = new BigDecimal(valor);
        BigDecimal result = ck.getSaldoInicial();
        System.out.println("Saldo inicial = " + result + "€");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
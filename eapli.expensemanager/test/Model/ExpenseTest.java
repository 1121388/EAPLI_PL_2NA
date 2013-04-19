/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.Console;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MNLyle
 */
public class ExpenseTest {
    
    public ExpenseTest() {
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
     * Test of getAmount method, of class Expense.
     */
    @Test
    public void testGetAmount() throws ParseException {
        System.out.println("getAmount");
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse("1-1-1");
        ExpenseType et = new ExpenseType("TipoDespesa");
        PaymentType pt = new PaymentType("DinheiroTipo");
        MeansOfPayment mp = new MeansOfPayment(pt);
        Expense instance = new Expense("Jantar", date, new BigDecimal(12), et, mp);
        BigDecimal expResult = new BigDecimal(12);
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetAmount2() {
        System.out.println("getAmount");
        ExpenseType et = new ExpenseType("TipoDespesa");
        PaymentType pt = new PaymentType("cheque");
        MeansOfPayment mp = new MeansOfPayment(pt, 1234567890);
        Expense instance = new Expense("Jantar", 1,1,1, new BigDecimal(12), et, mp);
        BigDecimal expResult = new BigDecimal(12);
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getExpenseType method, of class Expense.
     */
    @Test
    public void testGetExpenseType() {
        System.out.println("getExpenseType");
        ExpenseType et = new ExpenseType("TipoDespesa");
        PaymentType pt = new PaymentType("cheque");
        MeansOfPayment mp = new MeansOfPayment(pt, 1234567890);
        Expense instance = new Expense("Jantar", 1,1,1, new BigDecimal(12), et, mp);
        ExpenseType expResult = et;
        ExpenseType result = instance.getExpenseType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOccurred method, of class Expense.
     */
    @Test
    public void testGetDateOccurred() throws ParseException {
        System.out.println("getDateOccurred");
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse("1-1-1");
        ExpenseType et = new ExpenseType("TipoDespesa");
        PaymentType pt = new PaymentType("DinheiroTipo");
        MeansOfPayment mp = new MeansOfPayment(pt);
        Expense instance = new Expense("Jantar", date, new BigDecimal(12), et, mp);
        Date expResult = date;
        Date result = instance.getDateOccurred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
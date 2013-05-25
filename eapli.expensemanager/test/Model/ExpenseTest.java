/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        ExpenseType et = new ExpenseType("TipoDespesa", "TipoDespesa");
        Cash pt = new Cash();
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
        ExpenseType et = new ExpenseType("TipoDespesa", "TipoDespesa");
        Cash pt = new Cash();
        MeansOfPayment mp = new MeansOfPayment(pt);
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
        ExpenseType et = new ExpenseType("TipoDespesa", "TipoDespesa");
        Cash pt = new Cash();
        MeansOfPayment mp = new MeansOfPayment(pt);
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
        ExpenseType et = new ExpenseType("TipoDespesa", "TipoDespesa");
        Cash pt = new Cash();
        MeansOfPayment mp = new MeansOfPayment(pt);
        Expense instance = new Expense("Jantar", date, new BigDecimal(12), et, mp);
        Date expResult = date;
        Date result = instance.getDateOccurred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
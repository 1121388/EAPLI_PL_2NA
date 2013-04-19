/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ana
 */
public class ExpenseTest {
    
    public ExpenseTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
    public void testGetAmount() {
        System.out.println("getAmount");
        Expense instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseType method, of class Expense.
     */
    @Test
    public void testGetExpenseType() {
        System.out.println("getExpenseType");
        Expense instance = null;
        ExpenseType expResult = null;
        ExpenseType result = instance.getExpenseType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOccurred method, of class Expense.
     */
    @Test
    public void testGetDateOccurred() {
        System.out.println("getDateOccurred");
        Expense instance = null;
        Date expResult = null;
        Date result = instance.getDateOccurred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raul.Lima
 */
public class ExpenseTypeTest {
    
    public ExpenseTypeTest() {
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
     * Test of GetDescription method, of class ExpenseType.
     */
    @Test
    public void testGetDescription() {
        System.out.println("GetDescription");
        ExpenseType instance = new ExpenseType("GasN", "Gas Natural");
        String expResultName = "GasN";
        String expResultLongName = "Gas Natural";
        String resultName = instance.GetName();
        String resultLongName = instance.GetLongName();
        assertEquals(expResultName, resultName);
        assertEquals(expResultLongName, resultLongName);
    }
}
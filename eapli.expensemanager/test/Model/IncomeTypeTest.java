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
 * @author i980315
 */
public class IncomeTypeTest {
    
    public IncomeTypeTest() {
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
     * Test of getDescription method, of class IncomeType.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        IncomeType instance = new IncomeType("teste1");
        String expResult = "teste1";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class IncomeType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IncomeType instance = new IncomeType("teste1");
        String expResult = "Income type: teste1";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

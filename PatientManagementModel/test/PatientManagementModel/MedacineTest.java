/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jjbrewer
 */
public class MedacineTest {
    
    public MedacineTest() {
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
     * Test of getStock method, of class Medacine.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Medacine instance = null;
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Medacine.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Medacine instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStock method, of class Medacine.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Medacine instance = null;
        instance.setStock(stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restockMedacine method, of class Medacine.
     */
    @Test
    public void testRestockMedacine() {
        System.out.println("restockMedacine");
        int stockToBuy = 0;
        Medacine instance = null;
        instance.restockMedacine(stockToBuy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

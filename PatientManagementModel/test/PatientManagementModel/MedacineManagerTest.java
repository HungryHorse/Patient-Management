/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import java.util.List;
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
public class MedacineManagerTest {
    
    public MedacineManagerTest() {
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
     * Test of getMedacineList method, of class MedacineManager.
     */
    @Test
    public void testGetMedacineList() {
        System.out.println("getMedacineList");
        MedacineManager instance = null;
        List<Medacine> expResult = null;
        List<Medacine> result = instance.getMedacineList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedacineToRestock method, of class MedacineManager.
     */
    @Test
    public void testGetMedacineToRestock() {
        System.out.println("getMedacineToRestock");
        MedacineManager instance = null;
        List<Medacine> expResult = null;
        List<Medacine> result = instance.getMedacineToRestock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of givePatientMedacine method, of class MedacineManager.
     */
    @Test
    public void testGivePatientMedacine() {
        System.out.println("givePatientMedacine");
        Medacine medacine = null;
        int Quantity = 0;
        MedacineManager instance = null;
        instance.givePatientMedacine(medacine, Quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMedacine method, of class MedacineManager.
     */
    @Test
    public void testAddMedacine() {
        System.out.println("addMedacine");
        Medacine medacine = null;
        MedacineManager instance = null;
        instance.addMedacine(medacine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMedacineToRestock method, of class MedacineManager.
     */
    @Test
    public void testAddMedacineToRestock() {
        System.out.println("addMedacineToRestock");
        Medacine medacine = null;
        MedacineManager instance = null;
        instance.addMedacineToRestock(medacine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMedacine method, of class MedacineManager.
     */
    @Test
    public void testFindMedacine() {
        System.out.println("findMedacine");
        String name = "";
        MedacineManager instance = null;
        Medacine expResult = null;
        Medacine result = instance.findMedacine(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderMedacine method, of class MedacineManager.
     */
    @Test
    public void testOrderMedacine() {
        System.out.println("orderMedacine");
        Medacine medacine = null;
        int Quantity = 0;
        MedacineManager instance = null;
        instance.orderMedacine(medacine, Quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

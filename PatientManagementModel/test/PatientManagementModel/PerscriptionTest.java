/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.Doctor;
import Users.Patient;
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
public class PerscriptionTest {
    
    public PerscriptionTest() {
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
     * Test of getMedacinePrescribed method, of class Perscription.
     */
    @Test
    public void testGetMedacinePrescribed() {
        System.out.println("getMedacinePrescribed");
        Perscription instance = null;
        Medacine expResult = null;
        Medacine result = instance.getMedacinePrescribed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctor method, of class Perscription.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Perscription instance = null;
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class Perscription.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Perscription instance = null;
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Perscription.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Perscription instance = null;
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDosage method, of class Perscription.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Perscription instance = null;
        String expResult = "";
        String result = instance.getDosage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

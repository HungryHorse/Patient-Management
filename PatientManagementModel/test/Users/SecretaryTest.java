/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.Appointment;
import PatientManagementModel.Medacine;
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
public class SecretaryTest {
    
    public SecretaryTest() {
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
     * Test of approveAccount method, of class Secretary.
     */
    @Test
    public void testApproveAccount() {
        System.out.println("approveAccount");
        Patient patient = null;
        Secretary instance = null;
        instance.approveAccount(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePatient method, of class Secretary.
     */
    @Test
    public void testRemovePatient() {
        System.out.println("removePatient");
        Patient patient = null;
        Secretary instance = null;
        instance.removePatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of approveTermination method, of class Secretary.
     */
    @Test
    public void testApproveTermination() {
        System.out.println("approveTermination");
        Patient patient = null;
        Secretary instance = null;
        instance.approveTermination(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestedAccounts method, of class Secretary.
     */
    @Test
    public void testGetRequestedAccounts() {
        System.out.println("getRequestedAccounts");
        Secretary instance = null;
        List<Patient> expResult = null;
        List<Patient> result = instance.getRequestedAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestedAppointments method, of class Secretary.
     */
    @Test
    public void testGetRequestedAppointments() {
        System.out.println("getRequestedAppointments");
        Secretary instance = null;
        List<Appointment> expResult = null;
        List<Appointment> result = instance.getRequestedAppointments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestedTermination method, of class Secretary.
     */
    @Test
    public void testGetRequestedTermination() {
        System.out.println("getRequestedTermination");
        Secretary instance = null;
        List<Patient> expResult = null;
        List<Patient> result = instance.getRequestedTermination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restockMedacine method, of class Secretary.
     */
    @Test
    public void testRestockMedacine() {
        System.out.println("restockMedacine");
        Medacine medacine = null;
        int stockToBuy = 0;
        Secretary instance = null;
        instance.restockMedacine(medacine, stockToBuy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAppointment method, of class Secretary.
     */
    @Test
    public void testCreateAppointment() {
        System.out.println("createAppointment");
        Patient patient = null;
        Doctor doctor = null;
        String date = "";
        Secretary instance = null;
        instance.createAppointment(patient, doctor, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveMedacine method, of class Secretary.
     */
    @Test
    public void testGiveMedacine() {
        System.out.println("giveMedacine");
        Patient patient = null;
        Appointment appointment = null;
        Secretary instance = null;
        instance.giveMedacine(patient, appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Secretary.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String notificationMessage = "";
        Secretary instance = null;
        instance.update(notificationMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

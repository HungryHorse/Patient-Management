/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.Appointment;
import PatientManagementModel.Medacine;
import PatientManagementModel.Perscription;
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
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of makeNote method, of class Doctor.
     */
    @Test
    public void testMakeNote() {
        System.out.println("makeNote");
        Appointment appointment = null;
        String note = "";
        Doctor instance = null;
        instance.makeNote(appointment, note);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attendAppointment method, of class Doctor.
     */
    @Test
    public void testAttendAppointment() {
        System.out.println("attendAppointment");
        Appointment appointment = null;
        Doctor instance = null;
        instance.attendAppointment(appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerscription method, of class Doctor.
     */
    @Test
    public void testAddPerscription() {
        System.out.println("addPerscription");
        Appointment appointment = null;
        Perscription perscription = null;
        Doctor instance = null;
        instance.addPerscription(appointment, perscription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointments method, of class Doctor.
     */
    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Doctor instance = null;
        List<Appointment> expResult = null;
        List<Appointment> result = instance.getAppointments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veiwPatientHistory method, of class Doctor.
     */
    @Test
    public void testVeiwPatientHistory() {
        System.out.println("veiwPatientHistory");
        Patient patient = null;
        Doctor instance = null;
        List<Appointment> expResult = null;
        List<Appointment> result = instance.veiwPatientHistory(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proposeAppointment method, of class Doctor.
     */
    @Test
    public void testProposeAppointment() {
        System.out.println("proposeAppointment");
        Patient patient = null;
        String date = "";
        Doctor instance = null;
        instance.proposeAppointment(patient, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAppointment method, of class Doctor.
     */
    @Test
    public void testCreateAppointment() {
        System.out.println("createAppointment");
        Patient patient = null;
        String date = "";
        Doctor instance = null;
        instance.createAppointment(patient, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prescripeMedacine method, of class Doctor.
     */
    @Test
    public void testPrescripeMedacine() {
        System.out.println("prescripeMedacine");
        Patient patient = null;
        Medacine medacine = null;
        int quantity = 0;
        String dosage = "";
        Doctor instance = null;
        instance.prescripeMedacine(patient, medacine, quantity, dosage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointment method, of class Doctor.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        Appointment appointment = null;
        Doctor instance = null;
        instance.addAppointment(appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewMedacine method, of class Doctor.
     */
    @Test
    public void testCreateNewMedacine() {
        System.out.println("createNewMedacine");
        String name = "";
        int amountToStock = 0;
        Doctor instance = null;
        instance.createNewMedacine(name, amountToStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestOrdering method, of class Doctor.
     */
    @Test
    public void testRequestOrdering() {
        System.out.println("requestOrdering");
        String medacineName = "";
        Doctor instance = null;
        instance.requestOrdering(medacineName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRatings method, of class Doctor.
     */
    @Test
    public void testGetRatings() {
        System.out.println("getRatings");
        Doctor instance = null;
        List<String> expResult = null;
        List<String> result = instance.getRatings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Doctor.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        String rating = "";
        Doctor instance = null;
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFeedback method, of class Doctor.
     */
    @Test
    public void testGetFeedback() {
        System.out.println("getFeedback");
        Doctor instance = null;
        List<String> expResult = null;
        List<String> result = instance.getFeedback();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFeedback method, of class Doctor.
     */
    @Test
    public void testAddFeedback() {
        System.out.println("addFeedback");
        String feedback = "";
        Doctor instance = null;
        instance.addFeedback(feedback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Doctor.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String notificationMessage = "";
        Doctor instance = null;
        instance.update(notificationMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

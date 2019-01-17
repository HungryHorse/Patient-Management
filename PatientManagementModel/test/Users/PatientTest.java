/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.Appointment;
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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of RequestAccount method, of class Patient.
     */
    @Test
    public void testRequestAccount() {
        System.out.println("RequestAccount");
        Patient instance = null;
        instance.RequestAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RateDoctor method, of class Patient.
     */
    @Test
    public void testRateDoctor() {
        System.out.println("RateDoctor");
        Doctor doctor = null;
        String rating = "";
        Patient instance = null;
        instance.RateDoctor(doctor, rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SeeDoctorRatings method, of class Patient.
     */
    @Test
    public void testSeeDoctorRatings() {
        System.out.println("SeeDoctorRatings");
        Doctor doctor = null;
        Patient instance = null;
        List<String> expResult = null;
        List<String> result = instance.SeeDoctorRatings(doctor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RequestAppointment method, of class Patient.
     */
    @Test
    public void testRequestAppointment() {
        System.out.println("RequestAppointment");
        Doctor preferedDoctor = null;
        String date = "";
        Patient instance = null;
        instance.RequestAppointment(preferedDoctor, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpComingAppointment method, of class Patient.
     */
    @Test
    public void testSetUpComingAppointment() {
        System.out.println("setUpComingAppointment");
        Appointment appointment = null;
        Patient instance = null;
        instance.setUpComingAppointment(appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPerscription method, of class Patient.
     */
    @Test
    public void testGetPerscription() {
        System.out.println("GetPerscription");
        Patient instance = null;
        Perscription expResult = null;
        Perscription result = instance.GetPerscription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAppointment method, of class Patient.
     */
    @Test
    public void testGetAppointment() {
        System.out.println("GetAppointment");
        Patient instance = null;
        Appointment expResult = null;
        Appointment result = instance.GetAppointment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetDOB method, of class Patient.
     */
    @Test
    public void testGetDOB() {
        System.out.println("GetDOB");
        Patient instance = null;
        int expResult = 0;
        int result = instance.GetDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetGender method, of class Patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("GetGender");
        Patient instance = null;
        String expResult = "";
        String result = instance.GetGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistory method, of class Patient.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        Patient instance = null;
        List<Appointment> expResult = null;
        List<Appointment> result = instance.getHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RequestTermination method, of class Patient.
     */
    @Test
    public void testRequestTermination() {
        System.out.println("RequestTermination");
        Patient instance = null;
        instance.RequestTermination();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerscription method, of class Patient.
     */
    @Test
    public void testSetPerscription() {
        System.out.println("setPerscription");
        Perscription perscription = null;
        Patient instance = null;
        instance.setPerscription(perscription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAppointmentToHistory method, of class Patient.
     */
    @Test
    public void testAddAppointmentToHistory() {
        System.out.println("addAppointmentToHistory");
        Appointment appointment = null;
        Patient instance = null;
        instance.addAppointmentToHistory(appointment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Patient.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String notificationMessage = "";
        Patient instance = null;
        instance.update(notificationMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

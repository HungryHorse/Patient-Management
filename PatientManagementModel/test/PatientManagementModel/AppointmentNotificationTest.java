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
public class AppointmentNotificationTest {
    
    /**
     *
     */
    public AppointmentNotificationTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of requestedAppointment method, of class AppointmentNotification.
     */
    @Test
    public void testRequestedAppointment() {
        System.out.println("requestedAppointment");
        AppointmentNotification instance = new AppointmentNotification();
        instance.requestedAppointment();
    }

    /**
     * Test of addAppointment method, of class AppointmentNotification.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        AppointmentNotification instance = new AppointmentNotification();
        AccountManagement accountManager = new AccountManagement();
        MedacineNotification medacineNotification = new MedacineNotification();
        MedacineManager medacineManager = new MedacineManager(medacineNotification);
        Patient patient = new Patient("password","givenName","surname","address", 17,"gender", accountManager);
        Doctor doctor = new Doctor( accountManager, medacineManager, "password", "givenName", "surname", "address");
        
        instance.addAppointment(patient, doctor);
        assertEquals("New Appointment", patient.getNotifications().get(0));
        assertEquals("New Appointment", doctor.getNotifications().get(0)); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.Doctor;
import Users.Patient;
import Users.User;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of getNotes method, of class Appointment.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        AccountManagement accountManager = new AccountManagement();
        MedacineNotification medacineNotification = new MedacineNotification();
        MedacineManager medacineManager = new MedacineManager(medacineNotification);
        Doctor doctor = new Doctor( accountManager, medacineManager, "password", "givenName", "surname", "address");
        Patient patient = new Patient("password","givenName","surname","address", 17,"gender", accountManager);
        Appointment instance = new Appointment(doctor, patient, "03/04/98");
        instance.setNotes("These should be notes");
        String expResult = "These should be notes";
        String result = instance.getNotes();
        assertEquals(expResult, result);
    }
}

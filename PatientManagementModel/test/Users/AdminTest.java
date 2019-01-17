/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import PatientManagementModel.AccountManagement;
import PatientManagementModel.MedacineManager;
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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of addDoctor method, of class Admin.
     */
    @Test
    public void testAddDoctor() {
        System.out.println("addDoctor");
        AccountManagement accountManager = null;
        MedacineManager medacineManager = null;
        String password = "";
        String givenName = "";
        String surname = "";
        String adress = "";
        String dateOfBirth = "";
        String gender = "";
        Admin instance = null;
        instance.addDoctor(accountManager, medacineManager, password, givenName, surname, adress, dateOfBirth, gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDoctor method, of class Admin.
     */
    @Test
    public void testRemoveDoctor() {
        System.out.println("removeDoctor");
        Doctor doctor = null;
        Admin instance = null;
        instance.removeDoctor(doctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSecretary method, of class Admin.
     */
    @Test
    public void testAddSecretary() {
        System.out.println("addSecretary");
        AccountManagement accountManager = null;
        MedacineManager medacineManager = null;
        String password = "";
        String givenName = "";
        String surname = "";
        String adress = "";
        String dateOfBirth = "";
        String gender = "";
        Admin instance = null;
        instance.addSecretary(accountManager, medacineManager, password, givenName, surname, adress, dateOfBirth, gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSecretary method, of class Admin.
     */
    @Test
    public void testRemoveSecretary() {
        System.out.println("removeSecretary");
        Secretary secretary = null;
        Admin instance = null;
        instance.removeSecretary(secretary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of veiwDoctorRatings method, of class Admin.
     */
    @Test
    public void testVeiwDoctorRatings() {
        System.out.println("veiwDoctorRatings");
        Doctor doctor = null;
        Admin instance = null;
        List<String> expResult = null;
        List<String> result = instance.veiwDoctorRatings(doctor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveFeedback method, of class Admin.
     */
    @Test
    public void testGiveFeedback() {
        System.out.println("giveFeedback");
        Doctor doctor = null;
        String feedback = "";
        Admin instance = null;
        instance.giveFeedback(doctor, feedback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Admin.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String notificationMessage = "";
        Admin instance = null;
        instance.update(notificationMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

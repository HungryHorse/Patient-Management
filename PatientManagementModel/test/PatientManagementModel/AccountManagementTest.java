/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import Users.Admin;
import Users.Doctor;
import Users.Patient;
import Users.Secretary;
import Users.User;
import java.util.ArrayList;
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
public class AccountManagementTest {
    
    public AccountManagementTest() {
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
     * Test of createID method, of class AccountManagement.
     */
    @Test
    public void testCreateID() {
        System.out.println("createID");
        String type = "doctor";
        AccountManagement instance = new AccountManagement();
        String expResult = "D0000";
        String result = instance.createID(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of findIDType method, of class AccountManagement.
     */
    @Test
    public void testFindIDType() {
        System.out.println("findIDType");
        AccountManagement instance = new AccountManagement();
        Patient user = new Patient("password","givenName","surname","address", 17,"gender", instance);
        instance.requestAccount(user);
        char expResult = 'P';
        char result = instance.findIDType(user);
        assertEquals(expResult, result);
    }
    
    
    
    
}

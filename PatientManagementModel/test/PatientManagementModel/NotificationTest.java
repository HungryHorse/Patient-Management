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
import utilities.Observer;

/**
 *
 * @author jjbrewer
 */
public class NotificationTest {
    
    public NotificationTest() {
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
     * Test of removeObserver method, of class Notification.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        Observer o = null;
        Notification instance = new NotificationImpl();
        Boolean expResult = null;
        Boolean result = instance.removeObserver(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerObserver method, of class Notification.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        Observer o = null;
        Notification instance = new NotificationImpl();
        Boolean expResult = null;
        Boolean result = instance.registerObserver(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyObservers method, of class Notification.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        Notification instance = new NotificationImpl();
        instance.notifyObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NotificationImpl extends Notification {
    }
    
}

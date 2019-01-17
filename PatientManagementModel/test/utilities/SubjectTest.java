/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

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
public class SubjectTest {
    
    public SubjectTest() {
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
     * Test of registerObserver method, of class Subject.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        Observer o = null;
        Subject instance = new SubjectImpl();
        Boolean expResult = null;
        Boolean result = instance.registerObserver(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObserver method, of class Subject.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        Observer o = null;
        Subject instance = new SubjectImpl();
        Boolean expResult = null;
        Boolean result = instance.removeObserver(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyObservers method, of class Subject.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        Subject instance = new SubjectImpl();
        instance.notifyObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SubjectImpl implements Subject {

        public Boolean registerObserver(Observer o) {
            return null;
        }

        public Boolean removeObserver(Observer o) {
            return null;
        }

        public void notifyObservers() {
        }
    }
    
}

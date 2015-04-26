/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gcharan09
 */
public class GuestUserTest {
    
    public GuestUserTest() {
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

    @Test
    public void testGetDate() {
        System.out.println("getDate");
        GuestUser instance = new GuestUser();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        GuestUser instance = new GuestUser();
        instance.setDate(date);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRandNumber() {
        System.out.println("getRandNumber");
        GuestUser instance = new GuestUser();
        String expResult = "";
        String result = instance.getRandNumber();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRandNumber() {
        System.out.println("setRandNumber");
        String randNumber = "";
        GuestUser instance = new GuestUser();
        instance.setRandNumber(randNumber);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTime() {
        System.out.println("getTime");
        GuestUser instance = new GuestUser();
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        GuestUser instance = new GuestUser();
        instance.setTime(time);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        GuestUser instance = new GuestUser();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        GuestUser instance = new GuestUser();
        instance.setName(name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        GuestUser instance = new GuestUser();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        GuestUser instance = new GuestUser();
        instance.setEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAtttendees() {
        System.out.println("getAtttendees");
        GuestUser instance = new GuestUser();
        int expResult = 0;
        int result = instance.getAtttendees();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetAtttendees() {
        System.out.println("setAtttendees");
        int atttendees = 0;
        GuestUser instance = new GuestUser();
        instance.setAtttendees(atttendees);
        fail("The test case is a prototype.");
    }
    
}

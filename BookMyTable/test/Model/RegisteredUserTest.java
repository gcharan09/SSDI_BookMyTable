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
public class RegisteredUserTest {
    
    public RegisteredUserTest() {
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
    public void testGetFirstName() {
        System.out.println("getFirstName");
        RegisteredUser instance = new RegisteredUser();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        RegisteredUser instance = new RegisteredUser();
        instance.setFirstName(firstName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        RegisteredUser instance = new RegisteredUser();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        RegisteredUser instance = new RegisteredUser();
        instance.setLastName(lastName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        RegisteredUser instance = new RegisteredUser();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        RegisteredUser instance = new RegisteredUser();
        instance.setEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        RegisteredUser instance = new RegisteredUser();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        RegisteredUser instance = new RegisteredUser();
        instance.setPassword(password);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        RegisteredUser instance = new RegisteredUser();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        RegisteredUser instance = new RegisteredUser();
        instance.setPhoneNumber(phoneNumber);
        fail("The test case is a prototype.");
    }
    
}

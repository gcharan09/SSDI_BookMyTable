/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import Model.RegisteredUser;
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
public class RegisteredUserDBTest {
    
    public RegisteredUserDBTest() {
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
    public void testAddRegisteredUser() {
        System.out.println("addRegisteredUser");
        String firstName = "";
        String lastName = "";
        String email = "";
        String password = "";
        String phoneNumber = "";
        RegisteredUserDB instance = new RegisteredUserDB();
        instance.addRegisteredUser(firstName, lastName, email, password, phoneNumber);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUserByEmail() {
        System.out.println("getUserByEmail");
        String email = "";
        RegisteredUserDB instance = new RegisteredUserDB();
        RegisteredUser expResult = null;
        RegisteredUser result = instance.getUserByEmail(email);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

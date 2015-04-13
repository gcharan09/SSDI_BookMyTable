/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import Model.GuestUser;
import java.util.List;
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
public class GuestUserDBTest {
    
    public GuestUserDBTest() {
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
    public void testAddUser() {
        System.out.println("addUser");
        String name = "";
        String email = "";
        String date = "";
        String time = "";
        String randNumber = "";
        int attendees = 0;
        GuestUserDB instance = new GuestUserDB();
        instance.addUser(name, email, date, time, randNumber, attendees);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        GuestUserDB instance = new GuestUserDB();
        List<GuestUser> expResult = null;
        List<GuestUser> result = instance.getAllUsers();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUser() {
        System.out.println("getUser");
        int userID = 0;
        GuestUserDB instance = new GuestUserDB();
        GuestUser expResult = null;
        GuestUser result = instance.getUser(userID);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetUserByNumber() {
        System.out.println("getUserByNumber");
        String randNumber = "";
        GuestUserDB instance = new GuestUserDB();
        GuestUser expResult = null;
        GuestUser result = instance.getUserByNumber(randNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

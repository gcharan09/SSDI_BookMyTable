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
public class UserMenuTest {
    
    public UserMenuTest() {
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
    public void testGetQuantity() {
        System.out.println("getQuantity");
        UserMenu instance = new UserMenu();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        UserMenu instance = new UserMenu();
        instance.setQuantity(quantity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRandNumber() {
        System.out.println("getRandNumber");
        UserMenu instance = new UserMenu();
        String expResult = "";
        String result = instance.getRandNumber();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRandNumber() {
        System.out.println("setRandNumber");
        String randNumber = "";
        UserMenu instance = new UserMenu();
        instance.setRandNumber(randNumber);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        UserMenu instance = new UserMenu();
        String expResult = "";
        String result = instance.getMenu();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMenu() {
        System.out.println("setMenu");
        String menu = "";
        UserMenu instance = new UserMenu();
        instance.setMenu(menu);
        fail("The test case is a prototype.");
    }
    
}

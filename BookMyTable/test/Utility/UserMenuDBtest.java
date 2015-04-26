/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import Model.UserMenu;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SRINEAL
 */
public class UserMenuDBtest {
    
    public UserMenuDBtest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testAddMenu() {
        System.out.println("addMenu");
        String randNumber = "";
        String menu = "";
        int quantity = 0;
        UserMenuDB instance = new UserMenuDB();
        instance.addMenu(randNumber, menu, quantity);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMenuByNumber() {
        System.out.println("getMenuByNumber");
        String randNumber = "";
        UserMenuDB instance = new UserMenuDB();
        List<UserMenu> expResult = null;
        List<UserMenu> result = instance.getMenuByNumber(randNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}

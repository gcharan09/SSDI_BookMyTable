/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author gcharan09
 */
public class SignInControllerTest extends Mockito{
    
    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession session;
    RequestDispatcher requestDispatcher;
    
    public SignInControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        requestDispatcher = mock(RequestDispatcher.class);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSuccessfulSignUP() throws Exception {
        when(request.getParameter("action")).thenReturn("signup");
        when(request.getParameter("firstName")).thenReturn("Hemanth");
        when(request.getParameter("lastName")).thenReturn("P");
        when(request.getParameter("phoneNumber")).thenReturn("1234567890");
        when(request.getParameter("email")).thenReturn("phemanth@tmail.com");
        when(request.getParameter("password")).thenReturn("1234567890");
        when(request.getParameter("confirmPassword")).thenReturn("1234567890");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/signin.jsp")).thenReturn(requestDispatcher);
        try {
            System.out.println("doPost SignUp Testing");
            SignInController instance = new SignInController();
            instance.doPost(request, response);
            //verify(requestDispatcher).forward(request,response);
            assertTrue("Successful Login", request.getAttribute("message").equals("Sign up Successfull.Please Login"));
	} catch (ServletException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
    }
    
    
    @Test
    public void testPasswordFailureSignUP() throws Exception {
        when(request.getParameter("action")).thenReturn("signup");
        when(request.getParameter("firstName")).thenReturn("Hemanth");
        when(request.getParameter("lastName")).thenReturn("P");
        when(request.getParameter("phoneNumber")).thenReturn("1234567890");
        when(request.getParameter("email")).thenReturn("phemanth@kmail.com");
        when(request.getParameter("password")).thenReturn("1234567891");
        when(request.getParameter("confirmPassword")).thenReturn("1234567890");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/signin.jsp")).thenReturn(requestDispatcher);
        try {
            System.out.println("doPost SignUp Testing");
            SignInController instance = new SignInController();
            instance.doPost(request, response);
            verify(requestDispatcher).forward(request,response);
            assertTrue("Password MisMatch Failure", request.getAttribute("message").equals("Confirm password doesnot match!!"));			
	} catch (ServletException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
    }

    @Test
    public void testUserExistSignUP() throws Exception {
        when(request.getParameter("action")).thenReturn("signup");
        when(request.getParameter("firstName")).thenReturn("Hemanth");
        when(request.getParameter("lastName")).thenReturn("P");
        when(request.getParameter("phoneNumber")).thenReturn("1234567890");
        when(request.getParameter("email")).thenReturn("phemanth@tmail.com");
        when(request.getParameter("password")).thenReturn("1234567890");
        when(request.getParameter("confirmPassword")).thenReturn("1234567890");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/signin.jsp")).thenReturn(requestDispatcher);
        try {
            System.out.println("doPost SignUp Testing");
            SignInController instance = new SignInController();
            instance.doPost(request, response);
            verify(requestDispatcher).forward(request,response);
            assertTrue("User Alreay Exist Test", request.getAttribute("message").equals("User already exist"));			
	} catch (ServletException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
    }
    
    
     @Test
    public void testLoginSuccessful() throws Exception {
        when(request.getParameter("action")).thenReturn("login");
        when(request.getParameter("email")).thenReturn("phemanth@tmail.com");
        when(request.getParameter("password")).thenReturn("1234567890");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/signin.jsp")).thenReturn(requestDispatcher);
        try {
            System.out.println("doPost Login Testing");
            SignInController instance = new SignInController();
            instance.doPost(request, response);
            verify(requestDispatcher).forward(request,response);
            assertTrue("User Alreay Exist Test", request.getSession().getAttribute("typeOfUser").equals("RegisteredUser"));			
	} catch (ServletException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
    }
    
}

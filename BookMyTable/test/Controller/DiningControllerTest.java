/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @author gcharan09
 */
public class DiningControllerTest extends Mockito{
    
    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession session;
    ServletContext context;
    GenericServlet genericServlet;
    RequestDispatcher requestDispatcher;

    
    public DiningControllerTest() {
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
        context = mock(ServletContext.class);
        genericServlet = mock(GenericServlet.class);
        requestDispatcher = mock(RequestDispatcher.class);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDineIn() throws Exception {
        when(request.getParameter("action")).thenReturn("DineIn");
        when(request.getSession()).thenReturn(session);
        when(genericServlet.getServletContext()).thenReturn(context);
        when(request.getRequestDispatcher("/dinein.jsp")).thenReturn(requestDispatcher);
        System.out.println("doPost : Dine In");
        DiningController instance = new DiningController();
        instance.doPost(request, response);
        //verify(requestDispatcher).forward(request,response);
    }

    @Test
    public void testTakeAway() throws Exception {
        when(request.getParameter("action")).thenReturn("TakeAway");
        when(request.getSession()).thenReturn(session);
        when(genericServlet.getServletContext()).thenReturn(context);
        when(request.getRequestDispatcher("/takeaway.jsp")).thenReturn(requestDispatcher);
        System.out.println("doPost : Take Away");
        DiningController instance = new DiningController();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        verify(requestDispatcher).forward(request,response);
    }
        
}

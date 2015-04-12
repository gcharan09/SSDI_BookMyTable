/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserMenu;
import MyPackage.MainClass;
import Utility.UserMenuDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SRINEAL
 */
public class ConfirmationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConfirmationController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConfirmationController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name, email, attendees;
        
        if(request.getParameter("viewreservation") != null){
            request.setAttribute("message", "Reservation details");
            String rand = request.getParameter("viewreservation");
            UserMenuDB menu = new UserMenuDB();
            List<UserMenu> menuByNumber = menu.getMenuByNumber(rand);
            request.setAttribute("menuDetails", menuByNumber);
            request.setAttribute("displayMenu", "true");
            getServletContext()
                .getRequestDispatcher("/success.jsp")
                .forward(request, response);
        }
        if(request.getParameter("cancelreservation") != null){
            request.setAttribute("message", "You have successfully cancelled the reservation");
            getServletContext()
                .getRequestDispatcher("/success.jsp")
                .forward(request, response);
        }
        
        if(request.getParameter("verificationcode") != null){
            HttpSession session = request.getSession();
            String attribute = (String) session.getAttribute("currentUserEmail");
            String attribute1 = (String) session.getAttribute("currentUserName");
            
            MainClass mc = new MainClass();
            String rand = request.getParameter("verificationcode");
            mc.setTo(attribute);
            mc.initSender();
            mc.setBody("Hello "+attribute1+". \nYour reservation has been confirmed."
                    + "To view the reservation details please click the below link "
                    + "\n View reservation: http://localhost:8084/BookMyTable/ConfirmationController?viewreservation="+rand+""
                    + "\n\n To cancel the current reservation click the below link"
                    + "\ncancel reservation: http://localhost:8084/BookMyTable/ConfirmationController?cancelreservation="+rand+""
                    + "\n\nThis is an auto generated mail.Please do not reply.\n\nThank you");
            mc.sendMail();
            
            request.setAttribute("message", "Congratulations!! your reservation is confirmed.");
            
            getServletContext()
                .getRequestDispatcher("/success.jsp")
                .forward(request, response);
        }
        if(request.getParameter("emailId") != null && request.getParameter("Nameofperson") != null && request.getParameter("attendees") != null){
            email = request.getParameter("emailId");
            name = request.getParameter("Nameofperson");
            attendees = request.getParameter("attendees");
            request.getSession().setAttribute("currentUserEmail", email);
            request.getSession().setAttribute("currentUserName", name);
            MainClass mc = new MainClass();
            long rand = new Random().nextLong();
            request.getSession().setAttribute("ConfirmationID", rand);
            mc.setTo(email);
            mc.initSender();
            mc.setBody("Hello "+name+". \nPlease copy and paste the link in your browser to confirm the reservation "
                    + "link: http://localhost:8084/BookMyTable/ConfirmationController?verificationcode="+rand+""
                    + "\n\nThis is an auto generated mail.Please do not reply.\n\nThank you");
            mc.sendMail();
            UserMenuDB menu = new UserMenuDB();
            String[] menuItems = (String[]) request.getSession().getAttribute("selectedMenu");
            for(String m : menuItems){
                menu.addMenu(Long.toString(rand), m, 1);
            }
            request.setAttribute("message", "Please check your email for confirmation.");
            getServletContext()
                .getRequestDispatcher("/success.jsp")
                .forward(request, response);
        }
        if(request.getSession().getAttribute("typeOfUser") != null && request.getParameter("attendees") != null){
            email = (String) request.getSession().getAttribute("registeredUserEmail");
            MainClass mc = new MainClass();
            mc.setTo(email);
            mc.initSender();
            mc.setBody("Dear Customer"+" \nYour order has been confirmed."
                    + "\nPlease login to check your menu and other reservation details"
                    + "\n\nThis is an auto generated mail.Please do not reply.\n\nThank you");
            mc.sendMail();
            UserMenuDB menu = new UserMenuDB();
            String[] menuItems = (String[]) request.getSession().getAttribute("selectedMenu");
            for(String m : menuItems){
                menu.addMenu(email, m, 1);
            }
            request.setAttribute("message", "Confirmation details are sent to your mail.");
            getServletContext()
                .getRequestDispatcher("/success.jsp")
                .forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

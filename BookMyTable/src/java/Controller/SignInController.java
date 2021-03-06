/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.RegisteredUser;
import Utility.RegisteredUserDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SRINEAL
 */
public class SignInController extends HttpServlet {

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
            out.println("<title>Servlet SignInController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignInController at " + request.getContextPath() + "</h1>");
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email, firstName, lastName, password, confirmPassword, phoneNumber;
        String action = request.getParameter("action");
        String url = "/signin.jsp";
      
        if(action.equals("signupPage")){
            request.setAttribute("signType", "signup");
            request.setAttribute("message", "Welcome to SignUp page");
        }else if(action.equals("loginPage")){
            request.setAttribute("signType", "login");
            request.setAttribute("message", "Welcome to LogIn page");
        }else if(action.equals("signup")){
            RegisteredUserDB db = new RegisteredUserDB();
            firstName = request.getParameter("firstName");
            lastName = request.getParameter("lastName");
            phoneNumber = request.getParameter("phoneNumber");
            email = request.getParameter("email");
            password = request.getParameter("password");
            confirmPassword = request.getParameter("confirmPassword");
            
            if(password.equals(confirmPassword)){
                RegisteredUser user = db.getUserByEmail(email);
                if(user == null){
                    db.addRegisteredUser(firstName, lastName, email, password, phoneNumber);
                    request.setAttribute("signType", "login");
                    request.setAttribute("message", "Sign up Successfull.Please Login");
                }else{
                    request.setAttribute("message", "User already exist");
                    request.setAttribute("signType", "signup");
                }
            }else{
                request.setAttribute("message", "Confirm password doesnot match!!");
                request.setAttribute("signType", "signup");
            }
            
        }else if(action.equals("login")){
            RegisteredUserDB db = new RegisteredUserDB();
            email = request.getParameter("email");
            password = request.getParameter("password");
            RegisteredUser userByEmail = db.getUserByEmail(email);
            if(userByEmail != null){
                if(userByEmail.getPassword().equals(password)){
                    request.getSession().setAttribute("typeOfUser", "RegisteredUser");
                    request.getSession().setAttribute("registeredUserEmail", email);
                    url = "/dinein.jsp";
                }
            }else{
                
            }
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

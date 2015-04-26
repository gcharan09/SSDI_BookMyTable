/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SRINEAL
 */
public class DiningController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String diningType = null;
        String url = "/index.jsp";
        HttpSession session = request.getSession();
        if(request.getParameter("action") != null){
            diningType = request.getParameter("action");
            session.setAttribute("diningType", diningType);
        }
        if(diningType.equals("DineIn")){
            url = "/dinein.jsp";
        }else if(diningType.equals("TakeAway")){
            url = "/takeaway.jsp";
        }
        
        
//        getServletContext()
//                .getRequestDispatcher(url)
//                .forward(request, response);
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kausalya
 */
public class UserController extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String message= "Log in failed, try again";
            if (verifyUser(userName, password)){
                    message= "You have successfully logged in";
            }
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Logged in</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+message+"</h1>");
            out.println("</body>");
            out.println("</html>");
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserController</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserController at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    /**
     * Connect the Database and verify the user
     */
    private boolean verifyUser(String userName, String password) {
        boolean isUserExist = false;

        String dbUrl = "jdbc:mysql://localhost:3306/amudhuERP";
        String dbClass = "com.mysql.jdbc.Driver";
        String checkUserQuery = "Select * FROM user where userName='" + userName + "' and password='" + password + "'";

        try {
            System.out.println(checkUserQuery);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbUrl, "root","password");
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(checkUserQuery);
            isUserExist =  rs.next();
            con.close();
        } //end try
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUserExist;
    }
}

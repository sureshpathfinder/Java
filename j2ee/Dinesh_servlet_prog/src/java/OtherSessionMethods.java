/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author THENNARASU
 */
@WebServlet(name = "OthersesMethods", urlPatterns = {"/OthersesMethods"})
public class OtherSessionMethods extends HttpServlet 
{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession ses=request.getSession();
       
        try 
        {
           
            Integer count = (Integer) ses.getAttribute("count");
    if (count == null)
      count = new Integer(1);
    else
      count = new Integer(count.intValue() + 1);
    ses.setAttribute("count", count);

    out.println("<HTML><HEAD><TITLE>ses Count</TITLE></HEAD>");
    out.println("<BODY><H1>ses Count</H1>");

    out.println("You've visited this page " + count
        + ((count == 1) ? " time." : " times."));

    out.println("<P>");

    out.println("<H3>Here is your saved session data:</H3>");
    Enumeration e = ses.getAttributeNames();
    while (e.hasMoreElements())
    {
      String name = (String) e.nextElement();
      out.println(name + ": " + ses.getAttribute(name) + "<BR>");
    }

    out.println("<H3>Here are some vital stats on your session:</H3>");
    out.println("session id: " + ses.getId() + " <I>(keep it secret)</I><BR>");
    out.println("New session: " + ses.isNew() + "<BR>");
    ses.setMaxInactiveInterval(10);
    out.println("Timeout: " + ses.getMaxInactiveInterval());
    out.println("<I>(" + ses.getMaxInactiveInterval() / 60 + " minutes)</I><BR>");
    out.println("Creation time: " + ses.getCreationTime());
    out.println("<I>(" + new Date(ses.getCreationTime()) + ")</I><BR>");
    out.println("Last access time: " + ses.getLastAccessedTime());
    out.println("<I>(" + new Date(ses.getLastAccessedTime()) + ")</I><BR>");
    out.println("</BODY></HTML>");

             
        } 
        finally 
        {            
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
}

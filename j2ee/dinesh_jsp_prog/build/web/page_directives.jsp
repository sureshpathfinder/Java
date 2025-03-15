<%-- 
    Document   : page_directives
    Created on : Nov 7, 2011, 7:45:16 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*;" session="false" errorPage="fail.jsp" autoFlush="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Page Directives (Attributes)</h1><br></br><h2>
        <p> Content type : used to set the content type</p>
        <p> import : used to import the packages</p>
        <p> Session : used to tell the jsp that jsp page is participates in session</p>
        <p> Buffer : used to set the size of page buffer</p>
        <p> autoFlush : used to flush the page buffer</p>
        <p> errorPage : used to display the error page when error occured in JSP</p>
        <p> isErrorPage : used to access the exception implicit var to page</p></h2>
        <br></br>
        
        <%= new java.util.Date() %>
        
     </body>
</html>

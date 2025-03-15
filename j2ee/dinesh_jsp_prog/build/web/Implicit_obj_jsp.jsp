<%-- 
    Document   : Implicit_obj_jsp
    Created on : Nov 9, 2011, 5:43:31 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Implicit Object</title>
    </head>
    <body>
        <b><h2>
        <p>9 Implicit Object in JSP</p>
        <p>Application : used to access in same page</p>
        <p>Config : It provide info about the parameter</p>
        <p>Exception : used to define an error</p>
        <p>Out : used to return output to the client</p>
        <p>pageContext : used to provide method and functionality of custom action</p>
        <p>Request : Getting info</p>
        <p>page : Instance of the jsp page's</p>
        <p>response : used to return the info to the client</p>
        <p>session : used for the client</p></h2>
        
        <form action="parameters1.jsp" method="get">
                Name:<input type="text" name="t1" /><br />
                Age: <input type="text" name="t2" /><br>
                     <input type="submit" value="Click" name="btn"/>
        </form>

        
    </body>
</html>

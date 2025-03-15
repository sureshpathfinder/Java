<%-- 
    Document   : param_value
    Created on : Nov 10, 2011, 10:59:56 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="userBean" class="MY.MyBean" >
        <jsp:setProperty name="userBean" property="user" param="user"/>
        </jsp:useBean>
        <%= userBean.getUser()%>
    </body>
</html>

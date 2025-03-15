<%-- 
    Document   : ses_usebean1
    Created on : Nov 10, 2011, 11:25:10 PM
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
        <jsp:useBean id="userBean" scope="session" class="MY.MyBean">
            
        </jsp:useBean> 
    User Name: <%= userBean.getUser()%>
    </body>
</html>

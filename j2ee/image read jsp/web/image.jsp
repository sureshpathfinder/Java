<%-- 
    Document   : image
    Created on : 12-Aug-2011, 23:17:40
    Author     : popular
--%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% // declare a connection by using Connection interface Connection connection = null;
/* Create string of connection url within specified format with machine
name, port number and database name. Here machine name id localhost
and database name is mahendra. */
String connectionURL = "jdbc:mysql://localhost:3306/abdul";
/*declare a resultSet that works as a table resulted by execute a specified
sql query. */
ResultSet rs = null;
// Declare statement.
PreparedStatement psmnt = null;
// declare InputStream object to store binary stream of given image.
InputStream sImage;
try {
// Load JDBC driver "com.mysql.jdbc.Driver"
Class.forName("com.mysql.jdbc.Driver");
/* Create a connection by using getConnection() method that takes
parameters of string type connection url, user name and password to
connect to database. */
Connection con = DriverManager.getConnection(connectionURL, "root", "");
/* prepareStatement() is used for create statement object that is
used for sending sql statements to the specified database. */
psmnt = con.prepareStatement("SELECT image FROM save_image WHERE  id= ?");
psmnt.setString(1, "3"); 
rs = psmnt.executeQuery();
if(rs.next()) {
    out.print("hai");
byte[] bytearray = new byte[1048576];
int size=0;
sImage = rs.getBinaryStream(1);
response.reset();
response.setContentType("image/bmp");
while((size=sImage.read(bytearray))!= -1 ){
response.getOutputStream().write(bytearray,0,size);
}
}
}
catch(Exception ex){
out.println("error :"+ex);
}
finally {
 //close all the connections.
rs.close();
psmnt.close();
//con.close();
}
%>

    </body>
</html>

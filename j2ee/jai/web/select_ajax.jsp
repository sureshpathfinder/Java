<%@page import="java.sql.*"%>

<%
try
               {
    

String a=request.getParameter("t1");
 Connection con=null;
Statement stmt=null;
ResultSet rs =null;

String query="select * from student where student_id="+a;
Class.forName("com.mysql.jdbc.Driver");
  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");	
stmt=con.createStatement();
rs=stmt.executeQuery(query);
out.println("<table border='1'>");
out.print("<tr><th>Id</th><th>Age</th><th>FirstName</th><th>LastName</th><th>Email</th><th>Contact No.</th><th>Dept Id</th></tr>");

while(rs.next())
{
out.println("<tr>");
out.print("<td>"+rs.getString(1)+"</td>");
out.print("<td>"+rs.getString(2)+"</td>");
out.print("<td>"+rs.getString(3)+"</td>");
out.print("<td>"+rs.getString(4)+"</td>");
out.print("<td>"+rs.getString(5)+"</td>");
out.print("<td>"+rs.getString(6)+"</td>");
out.print("<td>"+rs.getString(7)+"</td>");
}

out.println("</table>");

}
catch(Exception e)
               {
    out.print(e);
}
%>


<%@page import="java.sql.*"%>
<%
try
{
       Connection con=null;
	Statement stmt=null;
	ResultSet rs =null;
    String a=request.getParameter("t1");
    String b=request.getParameter("t2");
    String c=request.getParameter("t3");
    String d=request.getParameter("t4");
    String e=request.getParameter("t5");
    String f=request.getParameter("t6");
    String g=request.getParameter("t7");;
    Class.forName("com.mysql.jdbc.Driver");
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");						
    stmt=con.createStatement();

    

String query="update student set age="+b+",first_name='"+c+"',last_name='"+d+"',email_id='"+e+"',contact_no='"+f+"',dept_id="+g+" where student_id="+a;
//out.print(query);
int i=stmt.executeUpdate(query);

if(i==1)
       {
            out.println("Updated");
       }
       else
                     {
                     out.println("Not updated");
}
}
catch(Exception e)
               {
    out.println(e);
}

%>


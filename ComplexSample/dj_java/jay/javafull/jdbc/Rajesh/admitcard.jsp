<%@ page language="java" import="java.sql.*,java.io.*;"%>
<%!
Connection con;
ResultSet rs;
Statement st;
PreparedStatement ps;
String cand;
String email;
String venue;
String time;
String date;	
%>
<%
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:Cmc1","scott","tiger");
st=con.createStatement();
cand=request.getParameter("cand");
email=request.getParameter("email");
venue=request.getParameter("venue");
time=request.getParameter("time");
date=request.getParameter("doe");

ps=con.prepareStatement("insert into ad_card values(?,?,?,?,?)");
ps.setString(1,cand);

ps.setString(2,email);

ps.setString(3,venue);

ps.setString(4,time);

ps.setString(5,date);

ps.executeUpdate();

st.execute("select * from ad_card");
rs=st.getResultSet();
while(rs.next())
{
out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
out.println("<hr>");
}
}
catch(Exception e)
{
out.println(e.getMessage());
}
%>
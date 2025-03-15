<%@page import="java.io.*,java.sql.*,java.util.Date,java.util.*,java.text.*" contentType="text/xml;charset=UTF-8"%>
<?xml version="1.0" encoding="UTF-8"?>

<%
	//System.out.println("HI");
	Connection con=null;
	Statement stmt=null;
	ResultSet rs =null;
		//String id=request.getParameter("id");
                String id="101";                   
		if(id==null) id="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");						
                        stmt=con.createStatement();
                        StringBuffer sbuf = new StringBuffer();
                        StringBuffer XML = new StringBuffer();
			XML.append("<students>");
                  	String query_div="select * from student where student_id="+101;
                        out.print(query_div);
			rs=stmt.executeQuery(query_div);
                       while (rs.next())
                        {
                                	XML.append("\n\t<student>");
					XML.append("\n\t\t<id>"+rs.getInt(1) + "</id>\n");
					XML.append("\t\t<age>"+rs.getInt(2) +"</age>\n");
                                        XML.append("\t\t<fname>"+rs.getString(3) +"</fname>\n");
                                        XML.append("\t\t<lname>"+rs.getString(4) +"</lname>\n");
                                        XML.append("\t\t<email>"+rs.getString(5) +"</email>\n");
                                        XML.append("\t\t<contact_no>"+rs.getString(6) +"</contact_no>\n");
                                        XML.append("\t\t<dept_id>"+rs.getInt(7) +"</dept_id>\n");
					XML.append("\t</student>\n");
			}
				XML.append("</students>\n");
				out.print(XML);
			
				
			}
			catch (Exception e){
                        out.print(e);
                        }
%>
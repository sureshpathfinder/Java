


<%@page import="java.sql.*" contentType="text/xml;charset=UTF-8"%>
<?xml version="1.0" encoding="UTF-8"?>
<%
	//System.out.println("HI");
	Connection con=null;
	Statement stmt=null;
	ResultSet rs =null;
		String id=request.getParameter("id");
                                  
		if(id==null) id="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");						
                        stmt=con.createStatement();
                        out.print("<students>");
                  	String query_div="select * from student where student_id="+id;
                        rs=stmt.executeQuery(query_div);
                       while (rs.next())
                        {
                                	out.print("\n\t<student>");
					out.print("\n\t\t<id>"+rs.getInt(1) + "</id>\n");
					out.print("\t\t<age>"+rs.getInt(2) +"</age>\n");
                                        out.print("\t\t<fname>"+rs.getString(3) +"</fname>\n");
                                        out.print("\t\t<lname>"+rs.getString(4) +"</lname>\n");
                                        out.print("\t\t<email>"+rs.getString(5) +"</email>\n");
                                        out.print("\t\t<contact_no>"+rs.getString(6) +"</contact_no>\n");
                                        out.print("\t\t<dept_id>"+rs.getInt(7) +"</dept_id>\n");
					out.print("\t</student>\n");
			}
				out.print("</students>\n");
				
			
				
			}
			catch (Exception e){
                        out.print(e);
                        }
%>
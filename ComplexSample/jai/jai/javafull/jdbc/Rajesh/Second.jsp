<html>
	<body bgcolor="red">
<%
	String s1=request.getParameter("t1");
	String s2=request.getParameter("t2");
	if(s1.equals("Rajesh")&&s2.equals("Karthik"))
		out.println("<h1> Correct");
		else
		out.println("<h1> Incorrect");
	%>
	</body>
</html>
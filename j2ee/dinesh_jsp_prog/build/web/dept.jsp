<%@ page import="java.util.*" %>
<html>
<body>
<h3><i> Request Parameters Forwarded
<table border=1 bordercolor=red>
<%
 Enumeration en=request.getParameterNames();
 
  while(en.hasMoreElements()){
	String name =(String)en.nextElement();
	String val  =request.getParameter(name);
        out.println("<tr><td>" + name + "<td>" + val);
  }
  out.println("<tr><td>Dept" + "<td>" + request.getAttribute("dept"));
%>
</table>
</body>	
</html>    
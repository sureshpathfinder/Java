<%@ page errorPage="exceptionpage.jsp" %>
<html>
<body>
<%
int age;
age = Integer.parseInt(request.getParameter("age"));
%>
<p>Your age is : <%= age %> years.</p>
<p><a href="error.html">Error</a></p>
</body>
</html>

<%@ page isErrorPage="true" import="java.io.*" %>
<html>
<body>
<%= exception.toString() %><br>
<%
StringWriter sw = new StringWriter();
PrintWriter pw = new PrintWriter(sw);
exception.printStackTrace(pw);
out.print(sw);
sw.close();
pw.close();
%>
</body>
</html>

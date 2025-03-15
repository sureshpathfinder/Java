<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>

<html> 
	<head>
		<title>JSP for exampleForm</title>
	</head>
	<body>
		<html:form action="register1">
			<html:errors /> <br>
			Name: <html:text property="email" /> <br>
			Age: <html:text property="password" /> <br>			
			<html:submit value="Send"/>
		</html:form>
	</body>
</html>
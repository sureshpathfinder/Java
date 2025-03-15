<%-- 
    Document   : index
    Created on : Aug 19, 2013, 10:41:41 PM
    Author     : MYPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
<head><title>Submit example</title></head>
<body>

<h3>Example Submit Page</h3>

<html:errors/>

<html:form action="submit.do">
Last Name: <html:text property="lastName"/><br>
Address:   <html:textarea property="address"/><br>
Sex:       <html:radio property="sex" value="M"/>Male 
           <html:radio property="sex" value="F"/>Female<br>
Married:   <html:checkbox property="married"/><br>
Age:       <html:select property="age">
             <html:option value="a">0-19</html:option>
             <html:option value="b">20-49</html:option>
             <html:option value="c">50-</html:option>
           </html:select><br>
           <html:submit/>
</html:form>

<logic:present name="lastName" scope="request">
Hello
<logic:equal name="submitForm" property="age" value="a">
  young
</logic:equal>
<logic:equal name="submitForm" property="age" value="c">
  old
</logic:equal>
<bean:write name="lastName" scope="request"/>
</logic:present>

</body>

<%-- 
    Document   : ses_items
    Created on : Nov 9, 2011, 7:49:46 PM
    Author     : THENNARASU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<body>
<pre>
<form>
<h2>Select The Items</h2>
<table border=2> 
<th>
<th>Books
<th>Price
<tr><td><input type=checkbox name=item1 value="JavaCompleteReference"><td>JavaCompleteReference<td>125$
<tr><td><input type=checkbox name=item2 value="PureJavaScript"><td>PureJavaScript<td>122$
<tr><td><input type=checkbox name=item3 value="CoreServlets"><td>CoreServlets<td>225$
<tr><td><input type=checkbox name=item4 value="ThinkingInJava"><td>ThinkingInJava<td>325$
</table>
<input type=submit name="Add"  value="AddToCart"><input type=submit name="View"  value="ViewCart"><input type=submit name="Check"  value="CheckOut">
</form>
</pre>
   <%      
        String addaction=request.getParameter("Add");
        if(addaction!=null) {
          if(addaction.equals("AddToCart")) {
	String paramname,paramval;
	Enumeration em = request.getParameterNames();
      
	while (em.hasMoreElements())
	{
		paramname = (String) em.nextElement();
	        paramval  = request.getParameter(paramname);
                session.setAttribute(paramname,paramval);
	}

        }
        }
        String viewaction=request.getParameter("View");
	if(viewaction!=null)
	 if (viewaction.equals("ViewCart")){
    %>
		<jsp:forward page="viewcart.jsp"/>		
    <% }
        String checkaction=request.getParameter("Check");
	if(checkaction!=null)
           if (checkaction.equals("CheckOut")){
    %>	
		<jsp:forward page="checkout.html"/>		

	
    <%  }  
    %>


</body>
</html>
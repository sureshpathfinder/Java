<%@ page language="Java" import="java.sql.*" %>

<html>

<head>

</head>


<body bgcolor="#CBD3DE">

<jsp:useBean id="bbank" scope="request" class="bank.Addbank" />
<form  method="post" name="bf1"  action="bankaddstore.jsp">

<p>&nbsp;</p>

       <%       

   			if(bbank.flag==true)
   			{
   		%><font color="red" align="center">
		<font color="green" size="5"><b>Error Message</b></font>   			<ul>
   		<%
      			if(bbank.getBcode().trim().length()==0)      
      			{     			 
      	%>
      	<br><li>
		<%		
      				out.println("Selete Bank code error ");
      			}

      		  if(bbank.getBname().trim().length()==0)       
      		  {
      	%>
      	<br><li>
      	<%		
      				out.println("Selete Bank Name error ");
      			}
				if(bbank.getLoca().trim().length()==0)
				{
		%>
		<br><li>
		<%		
      				out.println("Selete Location Name error ");
      			}
              if(bbank.getNstop().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Near Stop ");
      			}
              if(bbank.getPhoto1().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Photo first error ");
      			}
              if(bbank.getPhoto2().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Photo second ");
      			}
              if(bbank.getHead().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Head Name error ");
      			}
              if(bbank.getBott().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Bottom Name error ");
      			}
              if(bbank.getDbank().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Description about bank ");
      			}
              if(bbank.getMname().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Manager Name error ");
      			}
              if(bbank.getNemp().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Employe Name error ");
      			}
              if(bbank.getTiming().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Timing ");
      			}
              if(bbank.getPno().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Phone Number error ");
      			}
              if(bbank.getAdd().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Address error ");
      			}
              if(bbank.getWebs().trim().length()==0)
              {
       %>
		<br><li>
		<%		
      				out.println("Selete Web site Name error ");
      			}
			}	
       %>
		
				
 </font>

        <p>&nbsp;</p>

<div align="center">
<input type="hidden" name="flag" values="false">
  <table border="0" cellspacing="1" width="355" height="433">
<table>
    <tr>
    
      <td width="347" colspan="2" height="21" align="center" valign="top">
        <p align="center">BANK TABLE&nbsp;
        <p align="center">&nbsp;
        </td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Bank Code</td>
      <td width="201" height="25" align="center" valign="top"> 
                        <p align="center"> 
                        <input type="text" name="bcode"  size="20" value=<%=bbank.getBcode()%> > 


                        </p>


      </td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Bank Name</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="bname"  size="20" value=<%=bbank.getBname()%> > 


      </td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Location</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="loca"  size="20" value=<%=bbank.getLoca()%> > 


      </td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Near Stop</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="nstop"  size="20" value=<%=bbank.getNstop()%> > 


      </td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Photo1</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="photo1"  size="20" value=<%=bbank.getPhoto1()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Photo2</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="photo2"  size="20" value=<%=bbank.getPhoto2()%>></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Head</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="head"  size="20" value=<%=bbank.getHead()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Butoom</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="bott"  size="20" value=<%=bbank.getBott()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Descrption about Bank</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="dbank"  size="20" value=<%=bbank.getDbank()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Manager Name</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="mname"  size="20" value=<%=bbank.getMname()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">No of Employes</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="nemp"  size="20" value=<%=bbank.getNemp()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Timing</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="timing"  size="20" value=<%=bbank.getTiming()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Context Phone Nos</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="pno"  size="20" value=<%=bbank.getPno()%> ></td>
    </tr>
    <tr>
      <td width="140" height="25" align="center" valign="top">
        <p align="center">Address</td>
      <td width="201" height="25" align="center" valign="top">
        <p align="center"><input type="text" name="add"  size="20" value=<%=bbank.getAdd()%> ></td>
    </tr>
    <tr>
      <td width="140" height="22" align="center" valign="top">
        <p align="center">Web site</td>
      <td width="201" height="22" align="center" valign="top">
        <p align="center"><input type="text" name="webs"  size="20" value=<%=bbank.getWebs()%> ></td>
    </tr>
    <tr>
      <td width="140" height="1" valign="top">
        <p align="center"> 
      <input type="submit" name="Submit" value="Save">
      </td>
    </tr>
</form>
<p align="center">&nbsp;
</p>
<p align="center">&nbsp;</p>
</body>











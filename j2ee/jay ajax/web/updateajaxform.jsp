<%@page import="java.sql.*"%>
<html>
<head>
<title>
AJAX UPDATE FORM
</title>

<script type="text/javascript">
function getStudentDetails(id)
{
	var id = document.getElementsByName("sid")[0].value;
	if (window.XMLHttpRequest)
	{// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp=new XMLHttpRequest();
	}
	else
	{// code for IE6, IE5
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			var student_xml=xmlhttp.responseText;
		        //alert(student_xml);
			if(window.DOMParser)                        //for latest versions
			{
				parser=new DOMParser();
				xmlDoc=parser.parseFromString(student_xml,"text/xml");

			}
			else       //for ie older versions
			{
				xmlDoc=new ActiveXObject("Microsoft.XMLDOM");
				xmlDoc.async="false";
				xmlDoc.loadXML(student_xml);
                        }
                       var a=xmlDoc.getElementsByTagName("age")[0].childNodes[0].nodeValue;           //tag name
		       document.getElementsByName("age")[0].value=a;                                  //input type name  
	               
		       var fn=xmlDoc.getElementsByTagName("fname")[0].childNodes[0].nodeValue;
		       document.getElementsByName("fname")[0].value=fn;
		
	               var ln=xmlDoc.getElementsByTagName("lname")[0].childNodes[0].nodeValue;
		       document.getElementsByName("lname")[0].value=ln;
		
                       var em=xmlDoc.getElementsByTagName("email")[0].childNodes[0].nodeValue;
		       document.getElementsByName("email")[0].value=em;
	               
		       var con=xmlDoc.getElementsByTagName("contact_no")[0].childNodes[0].nodeValue;
		       document.getElementsByName("contact")[0].value=con;

                        var dep=xmlDoc.getElementsByTagName("dept_id")[0].childNodes[0].nodeValue;
			document.getElementsByName("dept_id")[0].value=dep;

			document.getElementsByName("update")[0].disabled=false;
		

		}
	}
	xmlhttp.open("POST","studentxml.jsp?id="+id,true);
	xmlhttp.send();
}
function updateStudent()
{
	var s_id=document.getElementsByName("sid")[0].value;
	var s_age=document.getElementsByName("age")[0].value;
 	var s_fname=document.getElementsByName("fname")[0].value;
    	var s_lname=document.getElementsByName("lname")[0].value;
  	var s_email=document.getElementsByName("email")[0].value;
  	var s_contact=document.getElementsByName("contact")[0].value;
  	var s_deptid=document.getElementsByName("dept_id")[0].value;

        var params="t1="+s_id+"&t2="+s_age+"&t3="+s_fname+"&t4="+s_lname+"&t5="+s_email+"&t6="+s_contact+"&t7="+s_deptid;

 if(window.XMLHttpRequest)
 {  //code for IE7+,firefox,chrome,opers,safari
	 xmlhttp=new XMLHttpRequest();
 } 
 else
 {   //code for IE6,IE5
	 xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
 }
 xmlhttp.onreadystatechange=function()
 {
	 if(xmlhttp.readyState==4 && xmlhttp.status==200)                    // 4 to indicate request is processed and result has been sent 200 to indicate ok we can proceed
	 {
		 document.getElementById("output").innerHTML=xmlhttp.responseText;
	 }
   
 }


 xmlhttp.open("POST","updateajax.jsp",true);
 
 xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
 xmlhttp.setRequestHeader("Content-length",params.length);
 xmlhttp.setRequestHeader("Connection","close");
 
 

 xmlhttp.send(params);
}
</script>


</head>
<body>
<%
try
               {
      Connection con=null;
	Statement stmt=null;
	ResultSet rs =null;
         Class.forName("com.mysql.jdbc.Driver");
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");						
    stmt=con.createStatement();
String query = "select student_id from student";

rs=stmt.executeQuery(query);

out.println("<table border=1><tr><td>Student List<td> : <td><select name='sid' onchange='getStudentDetails(this.value)'>");

while(rs.next())
{
        int idj=rs.getInt(1);
	out.println("<option value='"+idj+"'>"+idj+"</option>");
}

out.print("</select></tr>");

}
catch(Exception e)
               {
    out.println(e);
}

%>
<tr><td>Enter Student Age<td>:<td> <input type="text" name="age" value=""/></tr>
<tr><td>Enter Student First Name<td>:<td> <input type="text" name="fname" value=""/></tr>
<tr><td>Enter Student Last Name<td>: <td><input type="text" name="lname" value=""/></tr>
<tr><td>Enter Student Email Id<td>:<td> <input type="text" name="email" value=""/></tr>
<tr><td>Enter Student Contact No.<td>: <td><input type="text" name="contact" value=""/></tr>
<tr><td>Enter Student Dept Id.<td>:<td> <input type="text" name="dept_id" value=""/></tr>
</table>
<input type="button" name="update" value="update student" disabled="disabled" onclick="updateStudent()"> 
<p id="output">Output</p>
</html>

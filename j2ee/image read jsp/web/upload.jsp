<%@ page language="java" %>
<HTML>
<HEAD><TITLE>Display file upload form to the user</TITLE></HEAD>
<BODY> <FORM ENCTYPE="multipart/form-data" ACTION="uploadjsp.jsp" METHOD=POST>
<br><br><br>
<center>
<table border="0" bgcolor=#ccFDDEE>
<tr><center><td colspan="2" align="center"><B>UPLOAD YOUR DETAIL</B><center></td></tr>
<tr><td colspan="2" align="center"> </td></tr>
<tr><td><b>Enter your name:</b></td><td><INPUT name="name" TYPE="text"></td></tr>
<tr><td><b>Choose your photo:</b></td><td><INPUT name="file" TYPE="file"></td></tr>
<tr><td><b>Enter your city:</b></td><td><INPUT name="city" TYPE="text"></td></tr>
<tr><td><b>Enter your moblie no</b></td><td><INPUT name="mob" TYPE="text"></td></tr>
<tr><td colspan="2" align="center"> </td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Send File"> </td></tr>
<table>
</center>
</FORM>
</BODY>
</HTML>
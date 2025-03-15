
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%! String name1,city1,mob1;
%>
<%
 name1=request.getParameter("name");
mob1=request.getParameter("mob");
city1=request.getParameter("city");
out.println("hai"+name1);
out.println("hai"+mob1);
out.println("hai"+city1);
   String contentType = request.getContentType();

   int c=0;
if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
DataInputStream in = new DataInputStream(request.getInputStream());
int formDataLength = request.getContentLength();
byte dataBytes[] = new byte[formDataLength];
int byteRead = 0;
int totalBytesRead = 0;
while (totalBytesRead < formDataLength) {
byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
totalBytesRead += byteRead;
}
String file = new String(dataBytes);
String saveFile = file.substring(file.indexOf("filename=\"") + 10);
saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
int lastIndex = contentType.lastIndexOf("=");
String boundary = contentType.substring(lastIndex + 1,contentType.length());
int pos;
pos = file.indexOf("filename=\"");
pos = file.indexOf("\n", pos) + 1;
pos = file.indexOf("\n", pos) + 1;
pos = file.indexOf("\n", pos) + 1;
int boundaryLocation = file.indexOf(boundary, pos) - 4;
int startPos = ((file.substring(0, pos)).getBytes()).length;
int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
saveFile="D:/"+saveFile;
File ff = new File(saveFile);
FileOutputStream fileOut = new FileOutputStream(ff);
fileOut.write(dataBytes, startPos, (endPos - startPos));
fileOut.flush();
fileOut.close();
Connection connection = null;
String connectionURL = "jdbc:mysql://localhost:3306/abdul";
ResultSet rs = null;
PreparedStatement psmnt = null;
FileInputStream fis;
try {
    
    out.println("hai");
    out.println(saveFile);
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(connectionURL, "root", "");
File f = new File(saveFile);
String str=saveFile;
psmnt = connection.prepareStatement("insert into save_image(name, city, image, Phone) "+
				   "values(?,?,?,?)");
               psmnt.setString(1,name1);
	           psmnt.setString(2,city1);
               psmnt.setString(4,mob1);

fis = new FileInputStream(f);
psmnt.setBinaryStream(3,fis, (int)(f.length()));
int s = psmnt.executeUpdate();
  response.addHeader("pn",str);
  response.setHeader("userName","GSE_FMS");

if(s>0) {
out.println("Uploaded successfully !"+str);
    // File fff=new File(str);
out.println("hai"+name1);
out.println("hai"+mob1);
out.println("hai"+city1);
/*fis.close();
psmnt.close();
rs.close();
connection.close();*/

           // response.sendRedirect("delser");

}
else{
out.println("unsucessfull to upload file.");
}
 /* fis.close();
psmnt.close();
rs.close();
connection.close();*/
    }
catch(Exception e){
    e.printStackTrace();
}
}

%>
    </body>
</html>

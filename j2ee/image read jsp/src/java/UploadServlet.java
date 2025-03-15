import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UploadServlet extends HttpServlet {
   public void doPost(HttpServletRequest request,  HttpServletResponse response)throws IOException, ServletException{
   PrintWriter out = response.getWriter();
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
               psmnt.setString(1,"altaf");
	           psmnt.setString(2,"chennai");
               psmnt.setString(4,"97");

fis = new FileInputStream(f);
psmnt.setBinaryStream(3,fis, (int)(f.length()));
int s = psmnt.executeUpdate();
  response.addHeader("pn",str);
  response.setHeader("userName","GSE_FMS");

if(s>0) {
out.println("Uploaded successfully !"+str);
    // File fff=new File(str);

fis.close();
psmnt.close();
rs.close();
connection.close();
           
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

   }
}
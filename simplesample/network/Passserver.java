import java.net.*;
import java.io.*;
public class Passserver
{
public static void main(String args[])
{
try
{
mypwserver p=new mypwserver();
System.out.println("server has started");
p.activate();
}
catch(Exception e)
{
System.out.println("Error:Insocket");
}
}
}
class mypwserver
{
public void activate() throws Exception
{
ServerSocket ss=new ServerSocket(4001);
while(true)
{
Socket so=ss.accept();
DataInputStream d=new DataInputStream(so.getInputStream());
String passwd=d.readLine();
String response;
if(passwd.equals("Java"))
{
response="valid password";
}
else
{
response="Invalid password";
}
PrintStream p=new PrintStream(so.getOutputStream());
p.println(response);
so.close();
}
}
}

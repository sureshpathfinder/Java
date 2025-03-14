import java.io.*;
import java.net.*;
class Passclient
{
public static void main(String args[])
{
try
{
Socket so=new Socket("localhost",4001);
DataInputStream d=new DataInputStream(System.in);
String passwd=d.readLine();
PrintStream p=new PrintStream(so.getOutputStream());
p.println(passwd);
DataInputStream d1=new DataInputStream(so.getInputStream());
String r=d1.readLine();
System.out.println(r);
so.close();
}
catch(Exception e)
{
System.out.println("message from client:"+e);
}
}
}

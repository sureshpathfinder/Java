import java.net.*;
import java.io.*;
public class Fclient
{
public static void main(String args[]) throws Exception
{
 System.out.println("Enter a filename");
Socket so=new Socket("localhost",4001);
DataInputStream d=new DataInputStream(System.in);
String filename=d.readLine();
PrintStream p=new PrintStream(so.getOutputStream());
p.print(filename);
so.close();
so=new Socket("localhost",4001);
DataInputStream dd=new DataInputStream(so.getInputStream());
{
String result;
while((result=dd.readLine())!=null)
System.out.println(result);
}
so.close();
}
}

import java.net.*;
import java.io.*;
class Fserver
{
public static void main(String args[])
{
FileServer fs=new FileServer();
fs.start();
}
}
class FileServer extends Thread 
{
public void run()
{
try
{
String response=" ";
ServerSocket ss=new ServerSocket(4001);
while(true)
{
Socket so=ss.accept();
DataInputStream d=new DataInputStream(so.getInputStream());
String filename=d.readLine();
so.close();
File f=new File(filename);
if(f.isFile()&&f.canRead())
{
BufferedReader br=new BufferedReader(new FileReader(filename));
String temp;
while((temp=br.readLine())!=null)
{
response=response+temp;
response=response+"\n";
so.close();
}
}
else 
{
response="Invalid File Nmae";
}
so=ss.accept();
PrintStream p=new PrintStream(so.getOutputStream());
p.print(response);
so.close();
}
}
catch(Exception e)
{
System.out.println("error from exception");
}
}
}

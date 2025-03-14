import java.net.*;
import java.io.*;
class DatagramServer 
{
public static DatagramSocket ds;
public static int clientport=900,serverport=901;
public static void main(String args[])throws Exception
{
byte buffer[]=new byte[1024];
ds=new DatagramSocket(serverport);
BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
System.out.println("server waiting for input");
InetAddress ia=InetAddress.getByName("localhost");
while(true)
{
String str=d.readLine();
if((str==null||str.equals("end")))
break;
buffer=str.getBytes();
ds.send(new DatagramPacket(buffer,str.length(),ia,clientport));
}
}
}

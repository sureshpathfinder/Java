import java.net.*;
import java.io.*;
class DatagramClient
{
public static DatagramSocket ds;
public static byte buffer[]=new byte[1024];
public static int clientport=900,serverport=901;
public static void main(String args[]) throws Exception
{
ds=new DatagramSocket(clientport);
System.out.println("client is waiting for server to send data");
System.out.println("press ctrl+c to come to dos prompt");
while(true)
{
DatagramPacket p=new DatagramPacket(buffer,buffer.length);
ds.receive(p);
String ps=new String(p.getData(),0,p.getLength());
System.out.println(ps);
}
}
}





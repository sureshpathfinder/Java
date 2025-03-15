import java.io.*;
import java.net.*;
public class chatclient
{
public static void main(String args[])
{
DatagramSocket socket=null;
DatagramPacket recvPacket,sendPacket;
try
{
BufferedReader userdata=new BufferedReader(new InputStreamReader(System.in));
for(int i=0;i<80;i++)
{
System.out.print("*");
}
System.out.println("\nSoftware Solution Intergrated Limited (India)");
System.out.println("This is Client Program\n");
for(int i=0;i<80;i++)
{
System.out.print("*");
}
System.out.println("\nFirst you have to communicate to the server after typing the hostname:");
System.out.print("Please enter the host name where the server is located : ");
String hostname=userdata.readLine();
socket=new DatagramSocket(4546);
InetAddress hostAddress=InetAddress.getByName(hostname);
while(socket !=null)
{
String userstring=userdata.readLine();
if(userstring==null)
{
return;
}
byte sendbuf[]=userstring.getBytes();
sendPacket=new DatagramPacket(sendbuf,sendbuf.length,hostAddress,4545);
socket.send(sendPacket);
recvPacket=new DatagramPacket(new byte[512],512);
socket.receive(recvPacket);
System.out.write(recvPacket.getData(),0,recvPacket.getLength());
System.out.println("\n");
}
}
catch(SocketException se)
{
System.out.println("The Error in Simple Datagram Server : "+se);
}
catch(IOException ioe)
{
System.out.println("Error ");
}
}
}    

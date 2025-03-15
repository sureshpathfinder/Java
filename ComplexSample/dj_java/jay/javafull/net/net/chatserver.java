import java.io.*;
import java.net.*;
public class chatserver
{
public static void main(String args[])
{
DatagramSocket socket=null;
DatagramPacket recvPacket,sendPacket;
try
{
socket=new DatagramSocket(4545);
for(int i=0;i<80;i++)
{
System.out.print("*");
}
System.out.println("\nSoftware Solution Intergrated Limited (India)");
System.out.println("This is Server Program\n");
for(int i=0;i<80;i++)
{
System.out.print("*");
}
System.out.println("Waiting for client......\n\n");
while(socket !=null)
{
recvPacket=new DatagramPacket(new byte[512],200);
socket.receive(recvPacket);
System.out.write(recvPacket.getData(),0,recvPacket.getLength());
System.out.println("\n");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String res=br.readLine();
byte respond[]=res.getBytes();
sendPacket=new DatagramPacket(respond,respond.length,recvPacket.getAddress(),recvPacket.getPort());
socket.send(sendPacket);
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
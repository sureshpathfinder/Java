import java.io.*;
import java.net.*;

class cli1 
{
	public static void main(String args[]) throws Exception
	{
		DatagramPacket senp,recp;
		DatagramSocket socket;
		try
		{
		socket=new DatagramSocket(4000);
		System.out.println("Client is started");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter text for server");
			String msg = br.readLine();
		byte datas[] = msg.getBytes();
			if(datas.length<40)
			{
senp=new DatagramPacket(datas,datas.length,InetAddress.getLocalHost(),5000);
			                 socket.send(senp);
			}
		                 byte datar[]=new byte[256];
	recp=new DatagramPacket(datar,datar.length);
	socket.receive(recp);				
			System.out.println("-----------------------");
	System.out.println("message from sever");
			System.out.println("-----------------------");
                 System.out.println(new String(recp.getData()));		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			













































			
			
import java.io.*;
import java.net.*;

class ser1
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket socket;
		DatagramPacket sendp,recp;		
		try
		{
	                        socket=new DatagramSocket(5000);
		       System.out.println("Server Started");				
		                        byte datar[]=new byte[256];
	       recp=new DatagramPacket(datar,datar.length);
		       socket.receive(recp);	
	       System.out.println("-------------------------");				
	       System.out.println("message from client");
	       System.out.println("-------------------------");		
                        System.out.println(new String(recp.getData()));		
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter text for client");
		       String msg = br.readLine();
		       byte datas[] = msg.getBytes();
sendp=new DatagramPacket(datas,datas.length,InetAddress.getLocalHost() ,4000);
	                        socket.send(sendp);
		      socket.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	

			
	
//This is UDP type of networking.  It is Connectionless Networking.
//compile the client Program first then the server program since 
//the data is been transfered from the server to client
//since this is Connectionless networking both the client and the server must be in communication //status
//This is client program and the corresponding client program is "netser.java"

import java.net.*;

class netcli
{
	public static void main(String args[])
	{
		try
		{
			int serport=100,cliport=200;
			DatagramSocket ds=new DatagramSocket(200);
			byte b[]=new byte[500];
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String s=new String(dp.getData(),0,500);
			System.out.println(s);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
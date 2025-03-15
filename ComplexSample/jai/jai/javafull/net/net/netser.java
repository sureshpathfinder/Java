//This is UDP type of networking.  It is Connectionless Networking.
//compile the client Program first then the server program since 
//the data is been transfered from the server to client
//since this is Connectionless networking both the client and the server must be in communication //status
//This is server program and the corresponding client program is "netcli.java"

import java.net.*;

class netser
{
	public static void main(String args[])throws Exception
	{
		int serport=100,cliport=200;
		byte b[]=new byte[500];

		String s="welcome to java netwoking this is the message from server";
		b=s.getBytes();

		DatagramSocket ds=new DatagramSocket(serport);

		InetAddress ia=InetAddress.getLocalHost();

		DatagramPacket dp=new DatagramPacket(b,b.length,ia,cliport);
		ds.send(dp);

		System.out.println("data is transferred");
	}
}
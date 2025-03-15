//This is TCP/IP type of networking.  It is ConnectionOriented Networking.
//compile the client Program first then the server program since 
// Transfer data is from client to server
//since this is Connectionless networking both the client and the server must be in communication 
//status
//This is client program and the corresponding client program is "netser2.java"
// Transfer data from client to server

import java.net.*;
import java.io.*;

class netcli2
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket(InetAddress.getLocalHost(),90);
			String a="example of socket and server socket";
			byte b[]=a.getBytes();
			DataOutputStream ds=new DataOutputStream(s.getOutputStream());
			ds.write(b,0,b.length);
			ds.close();
			s.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
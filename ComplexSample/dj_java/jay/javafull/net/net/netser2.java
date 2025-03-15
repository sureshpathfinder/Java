//This is TCP/IP type of networking.  It is ConnectionOriented Networking.
//compile the client Program first then the server program since 
// Transfer data is from client to server
//since this is Connectionless networking both the client and the server must be in communication 
//status
//This is server program and the corresponding client program is "netcli2.java"
// Transfer data from client to server


import java.net.*;
import java.io.*;

class netser2
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(90);
//Application No.(Port no.)
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			String s1;
			while((s1=din.readLine())!=null)
				System.out.println(s1);
			din.close();
			ss.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
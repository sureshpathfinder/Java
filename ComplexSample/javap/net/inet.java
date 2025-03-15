import java.net.*;

class inet
{
	public static void main(String args[])
	{
		try
		{
InetAddress i1 = InetAddress.getLocalHost();
InetAddress i2= InetAddress.getByName("Ssimain");
System.out.println("This Machine address :"+i1);
System.out.println("Other Machine :"+i2);
		}
		catch(UnknownHostException u)
		{
			System.out.println(u);
		}
	}
}	
	
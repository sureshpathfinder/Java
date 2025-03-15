import java.net.*;
class InetAddressTest
{
public static void main(String args[])
{
try
{
InetAddress ia=InetAddress.getLocalHost();
System.out.println("Address of local host is:"+ia);
}
catch(UnknownHostException u)
{
}
}
}

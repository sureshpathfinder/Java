import java.net.*;
import java.io.*;
class inettest
{
        public static void main(String ar[])throws Exception 
        {
                System.out.println("Enter the Host name:");
                String s=(new DataInputStream(System.in)).readLine();
                InetAddress i=InetAddress.getByName(s);
                System.out.println("Host name is : "+i.getHostName());
                System.out.println("InetAddress is : "+i);
        }
}
                

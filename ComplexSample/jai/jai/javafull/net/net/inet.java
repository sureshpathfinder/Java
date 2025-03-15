import java.net.*;
class inet
{
        public static void main(String args[])
        {
                try
                {
              InetAddress add=InetAddress.getLocalHost();
              System.out.println("Address of Local Host Is : " + add);
           InetAddress add1=InetAddress.getByName("classroom2");
              System.out.println("Your Requsted System Host name & IP address : "+add1);
                }
                catch(UnknownHostException u)
                {
                System.out.println(u);
                }

        }
}

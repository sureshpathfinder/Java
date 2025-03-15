import java.io.*;
import java.net.*;
class datagramserver
{
        public static DatagramSocket ds;
        public static int clientport=789,serverport=790;
        public static void main(String ar[])throws Exception
        {
                byte buffer[]=new byte[1024];
                ds=new DatagramSocket(serverport);
                BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Server waiting for input");
                InetAddress ia=InetAddress.getByName("classroom2");
                while(true)
                {
                        String str=dis.readLine();
                        if(str.equals("end"))
                        break;
                        buffer=str.getBytes();
                        ds.send(new DatagramPacket(buffer,str.length(),ia,clientport));
                }

        }
}



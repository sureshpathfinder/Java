import java.net.*;
import java.io.*;
public class echoclient
{
        public static void main(String ar[])throws Exception
        {
                Socket echosocket=null;
                BufferedReader in=null;
                try
                {
                        echosocket=new Socket(InetAddress.getLocalHost(),95);
                        in=new BufferedReader(new InputStreamReader(echosocket.getInputStream()));
                }catch(UnknownHostException e)
                {
                        System.out.println("Host not Found");
                        System.exit(1);
                }
                catch(IOException e)
                {
                        System.out.println("Cannot get connection");
                        System.exit(1);
                }

                String userinput;
                while((userinput=in.readLine())!=null)
                {
                        System.out.println(userinput);
                }
                in.close();
                echosocket.close();

        }
}

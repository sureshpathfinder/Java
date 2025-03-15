import java.net.*;
import java.io.*;
public class fclient
{
        public static void main(String a[])throws IOException
        {
     Socket s=null;
     BufferedReader in=null;
               try
                {
         s=new Socket(InetAddress.getLocalHost(),95);
         in=new BufferedReader(new InputStreamReader(s.getInputStream()));

                }catch(UnknownHostException e)
                {
                        System.err.println("Don't know about host");
                        System.exit(1);
                }catch(IOException e)
              {
          System.err.println("Couldn't get I/o for the Connection");
                        System.exit(1);
                }
                String userInput;
                while((userInput=in.readLine())!=null)
                {
                        System.out.print(userInput);
                }
                in.close();
                s.close();
        }
}


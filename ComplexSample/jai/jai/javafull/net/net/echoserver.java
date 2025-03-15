import java.net.*;
import java.io.*;
public class echoserver
{
        public static void main(String ar[])throws IOException
        {
                ServerSocket serversocket=null;
                try
                {
                        serversocket=new ServerSocket(95);
                }catch(IOException e)
                {
                        System.out.println("Could not listen on port 95");
                        System.exit(1);
                }

                Socket clientSocket=null;
                try
                {
                       clientSocket=serversocket.accept();
                       System.out.println("Connected to "+clientSocket);
                }catch(IOException e)
                {
                        System.out.println("Accept Failed");
                        System.exit(1);
                }

                PrintWriter out=new PrintWriter(clientSocket.getOutputStream(),true);
               // BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the Data in the server");
                while((inputLine=stdin.readLine())!=null)
                {
                                out.println(inputLine);
                }
                out.close();
   //             in.close();
                stdin.close();
                clientSocket.close();
                serversocket.close();
        }
}

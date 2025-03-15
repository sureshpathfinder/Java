import java.net.*;
import java.io.*;
public class fserver
{
        public static void main(String a[])throws IOException
        {
   ServerSocket s=null;
                try
                {
       s=new ServerSocket(95);
                }
                catch(IOException e)
                {
                System.err.println("Could not listen on port 95");
                System.exit(1);
                }
                Socket cs=null;
                try
                {
                        cs=s.accept();
                        System.out.println("Connected to" + cs);
                }catch(IOException e)
                {
                        System.err.println("Accept failed");
                        System.exit(1);
                }
         PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
         String inputLine,outputLine;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter data in server");
               String s1=br.readLine();
                   File f=new File(s1);
                if(f.exists())
                {
               BufferedReader br1=new BufferedReader(new FileReader(s1));
                        String line;
                        while((line=br1.readLine()) !=null)
                        {
                                out.write(line);
                                out.flush();
                        }
                        br1.close();
                }
                out.close();
                cs.close();
                s.close();
        }
}




                        

import java.io.*;

public class Sona304
{
       public static void main(String argv[])
       {
          Sona304 t = new Sona304();
          t.amethod();
       }
    
       public void amethod()
       {
                 try
                {
                    ioCall();
                 }
                catch(IOException ioe) { }
      }
     
     public void ioCall() throws IOException
     {
         DataInputStream din = new DataInputStream(System.in);
         din.readChar();
     }
         
}
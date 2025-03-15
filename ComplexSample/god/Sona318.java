import java.io.*;

class Base
{
    public static void amethod()throws FileNotFoundException
   {   }
}

public class Sona318 extends Base
{
   public static void main(String argv[])
   {
       Sona318 e = new Sona318(); 
   }
   
   public static void amethod()
   {   }

   protected Sona318() 
  {
     try
    {
         DataInputStream din = new DataInputStream(System.in);
        System.out.println("Pausing");
        din.readChar();
         System.out.println("Continuing");
        this.amethod();
    }
    catch(IOException ioe) 
   {   }
 } 
}   
import java.io.*;

  class A
   {
       public void test() 
         {
            System.out.println("Hello");
          } 
   }

public class Sona334 extends A
  {
      public void test() throws IOException
        {
           System.out.println("Servlet");
        }

      public static void main(String[] args)
         {
             A a = new A();

             try
               {
                  a.test();
               }

             catch(IOException ioe)
               {
               }
          }
     } 



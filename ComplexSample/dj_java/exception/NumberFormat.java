import java.util.*;
import java.io.*;

class NumberFormat 
{
  public static void main(String args[])throws IOException
  {
      try
      {
        base b=new base();
        b.display();
      }
      catch(Exception e)
      {
        System.out.println("Error : Invalid Input...!" +e);
      }
      finally
      {
        System.out.println("End of Program...!");
      }
         
    }
}

class base
{
  int a,b,c;
      void display()
      {
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=a+b;
      System.out.println("Result ="+c);
      }
}
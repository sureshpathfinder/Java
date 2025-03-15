import java.io.*;
public class excepM2
{
  public static void main(String args[])
  {
      try
      {
        int a[] = {1,2,3};
         System.out.println("Element in an Array :" + a[4]);
      }
      catch(Exception e)
      {
         System.out.println("Exception thrown  :" + e);
      }
     
   }
}

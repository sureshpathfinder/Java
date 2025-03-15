public class Sona268
{
  public static void main(String ar[])
  {
    try
    {
      int a=4/0;
      return;
     }
     catch(ArithmeticException ex)
     {
          System.out.println("Error");     
          return;
     }
     finally
     {
        System.out.println("finally");
        return;
     }
      System.out.println("hai");
  }
}  
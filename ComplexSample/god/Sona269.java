public class Sona269
{
  public static void main(String ar[])
  {
    try
    {
      int a=4/1;
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
//      System.out.println("hai");
  }
}  
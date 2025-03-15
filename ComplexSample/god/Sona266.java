public class Sona266
{
  public static void main(String ar[])
  {
    try
    {
      int a=4/0;
     }
     catch(ArithmeticException ex)
     {
        System.out.println("Error");
     }
     finally
     {
        System.out.println("finally");
     }
     System.out.println("in main method");
  }
}  
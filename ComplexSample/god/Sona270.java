public class Sona270
{
  public static void main(String ar[])
  {
    try
    {
      int a=4/0;
    }
    catch(Exception ex)
    {
        System.out.pritnln("exception");
    }
     catch(ArithmeticException ex)
     {
          System.out.println("Error");     
     }
     finally
     {
        System.out.println("finally");
     }
  }
}  
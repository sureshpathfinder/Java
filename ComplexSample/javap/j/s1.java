import java.util.*;
class s1
{
  public static void main(String ar[])
  {
    Scanner s=new Scanner(System.in);
      try
    {
      int a=s.nextInt();
      System.out.println("a="+a);
    }
    catch(NumberFormatException e)
    {
      System.out.println("error="+e);
    }
  }
}
      
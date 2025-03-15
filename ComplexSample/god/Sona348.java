public class Sona348
{
  public static void main(String ar[])
  {   String s=null;
       int a[]=new int[0];
       a=null;
       try
       {
           System.out.println(a.length);
          System.out.println(s.length());
       }
      catch(NullPointerException ne)
      {  System.out.println("wel");
            }
  }
}
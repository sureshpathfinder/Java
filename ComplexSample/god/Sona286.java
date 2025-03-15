interface A
{
   public void dis();
   }


public class Sona286 implements A
{
  public void dis()
  {
     }
  public static void main(String ar[])
  {
  A a1=new Sona286();
  boolean b=a1 instanceof A;
  System.out.println(b);
 }
}
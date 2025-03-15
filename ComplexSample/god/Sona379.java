class A
{
  public void amethod(int a,int b)
  {
     System.out.println("value of a="+a);
     System.out.println("value of b="+b);
  }
}

public class Sona379 extends A
{
 public void amethod(int a,int b)
  {
     int c=a+b;
     System.out.println(c);
  }
 public static void main(String ar[])
 {
    A a1=new Sona379();
    a1.amethod(10,20);
 }
}
class A
{
  }

public class Sona350 extends A
{
  public static void main(String ar[])
  {
     A a=new A();
     Sona350 s=new Sona350();
      //A s2=s;
      s.add(s);
  }

  public void add(A s)
  {
      System.out.println(s);
  }
}
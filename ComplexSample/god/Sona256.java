class A
{
  A(int a)
  {
     System.out.println(a);
  }
}

public class Sona256 extends A
{
  Sona256(int a)
  {
     super(1);
     System.out.println(a);
  }
 public static void main(String ar[])
  {
    A a1=new A(2);
    Sona256 b1=new Sona256(3);
  }
}  
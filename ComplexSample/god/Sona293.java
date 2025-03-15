abstract class A
{
  int a=10;
 }

class B extends A
{
  void dis()
   {
       a++;
       System.out.println(a);
   }
}

class Sona293
{
  public static void main(String ar[])
  {
     B b=new B();
     b.dis();
     System.out.println(b.a);
  }
}
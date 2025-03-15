class A
{
  B b=new B();
  A()
  {
    System.out.println("class A");
  }
}

class B
{
  B()
   {
     System.out.println("class B");
   }
}

class Sona252 extends A
{
  B b1=new B();
  Sona252()
  {
    System.out.println("class C");
  }
 public static void main(String ar[])
 {
  new Sona252();
 }
}

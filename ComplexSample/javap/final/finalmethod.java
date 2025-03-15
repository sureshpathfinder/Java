class finalmethod
{
  public static void main(String[] args) 
  {
    A a=new A();
    B b=new B();
    b.method1();
    b.method2();
    a.method1();
  }
}
class A
{
  public void method1()
  {
  System.out.println("Method 1");
  }
  public final void method2()
  {
  System.out.println("Final Method");
  }
}
class B extends A
{
  public void method1()
  {
  System.out.println("Derived Method 1");
  }
  public void method2()
  {
  System.out.println("Final Method");
  }
}



  
  
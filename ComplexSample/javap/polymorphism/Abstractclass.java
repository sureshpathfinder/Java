class Abstractclass 
{
  public static void main(String[] args) 
  {
    DerivedClass b = new DerivedClass();
    b.baseMethod1();
    b.baseMethod2();
  }
}
abstract class BaseAbstractClass 
{
  abstract void baseMethod1(); 
  // Definition done in DerivedClass class

  void baseMethod2()
  {
    System.out.println("baseMethod2() method ");
  }
}

class DerivedClass extends BaseAbstractClass
{
  void baseMethod1()
  {
  System.out.println("Defining the defination of abstract method");
  }
}


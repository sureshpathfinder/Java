class Inher_Multi
{
  public static void main(String s[])
  {
    derived2 d1=new derived2();
    d1.show();
    d1.display();
    d1.disp();
  }
}

class base
{
  int a,b,c;
  base()
  {
    a=50;
    b=50;
  }
  void show()
  {
    c=a+b;
    System.out.println("Result for ADDITION in BASE CLASS ="+c);
  }
}

class derived1 extends base
{
  int d;
  derived1()
  {
    d=50;
  }
  void display()
  {
    System.out.println("Result for Subtraction in DERIVED CLASS ="+(c-d));
  }
}
                         
    
class derived2 extends derived1
{
  int e;
  derived2()
  {
    e=100;
  }
  void disp()
  {
    System.out.println("Result for Division ="+(e/d));
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
  
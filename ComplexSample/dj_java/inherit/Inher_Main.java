class Inher_single
{
  public static void main(String s[])
  {
    derived d1=new derived();
    d1.show();
    d1.display();
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

class derived extends base
{
  int d;
  derived()
  {
    d=50;
  }
  void display()
  {
    System.out.println("Result for Subtraction in DERIVED CLASS ="+(c-d));
  }
}
                         
    
    
  
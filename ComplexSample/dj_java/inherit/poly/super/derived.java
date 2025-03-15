class derived extends base
{ 
   int x;  
  derived(int m,int p,int g)
  {
    super.a=m;
    super.b=p;
     x=g;
    System.out.println("Derived = "+x);
  }
    
  public static void main(String args[])
  {
    derived d=new derived(10,20,30);
    d.display();
  }
}

class base
{
  int a,b;
  void display()
  {
    System.out.println("base = "+(a+b));
  }
}
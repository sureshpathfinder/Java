class single
{
public static void main(String args[])
{
    B b = new B();
    b.get(5,6);
    b.show();
    b.display();
    }
}
class A
 {
  int x;
  int y;
  void get(int p,int q)
  {
    x=p; y=q;
  }
    void show()
    {
      System.out.println("X="+x);
    }
}

class B extends A
{
     void display()
    {      
      System.out.println("Y="+y);
    }
} 

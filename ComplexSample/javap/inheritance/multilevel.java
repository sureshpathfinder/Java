class multilevel
{
  public static void main(String args[])
  {
    C c = new C();
    c.get(5,6);
    c.Show();
    c.Showb();
    c.display();
    }
 }
class A 
{
  int x;
  int y;
  int get(int p, int q)
{
    x=p; y=q; return(0);
    }
    void Show()
{
      System.out.println(x+" "+y);
      }
}
class B extends A
{
  void Showb()
{

    System.out.println("B");
    }
}

class C extends B
{
  void display()
  {
    System.out.println("C");
  }
 
} 

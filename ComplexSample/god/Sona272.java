 class A
{
 void display()
  {
    System.out.println("display");
  }
}

public class Sona272 extends A
{
  public void display()
  {
    System.out.println("class sona");
  }
  public static void main(String are[])
  {
    A a1=new A();
    a1.display();
    Sona272 a2=new Sona272();
    a2.display();
 }
}
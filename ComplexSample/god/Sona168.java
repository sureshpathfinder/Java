class A
 {
   public void display()
    {
       System.out.println("class a6");
    }
 }

public class Sona168 extends A
{
   public void display1()
    {
       System.out.println("class a7");
     }
  
   public static void main(String ar[])
     {
       A a=new Sona168();
       a.display();
       a.display1();
     }
  }

class A
  {
     public A()
       {
          System.out.println("Class A");
       }
    public void act()
      {
         System.out.println("act in class A");
      }
  }

class B extends A
  {
     public B()
       {
          System.out.println("Class B");
       }
    public void act()
       {
          System.out.println("act in class B");
       }
  }

public class Sona97
  {
     public static void main(String[] args)
       {
         A a=new B();
            a.act();
       }
 }
 
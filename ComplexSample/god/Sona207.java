class A
  {
     public void act()
       {
          System.out.println("act method in class A");
       }
  }

public class Sona207 extends A
  {
     public void display()
       {
          System.out.println("display method in Sona207");
       }

     public static void main(String[] args)
       {
          A a=new Sona207();

          a.act();
         a.display();

         A b=new A();
         Sona207 c=new Sona207();
         b=c;

         b.act();
         b.display();
      }
  }  
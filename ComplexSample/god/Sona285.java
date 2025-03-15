class A
   {
      abstract void act();
   }

 class B extends A
   {
      void act()
        {
           System.out.println("act()");
        }
   }

public class Sona285
   {
      public static void main(String[] args)
         {
             B b=new B();
             b.act();
         }
  }  
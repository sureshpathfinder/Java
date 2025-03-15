class A
   {
       public A()
          {
              System.out.println("Class A");
          }
   }

class B extends A
   {
      public B()
        {
           System.out.println("Class B");
        }
   }

public class Sona382 extends B
  {
      public Sona382()
         {
            this("hello");
            System.out.println("Class Sona382");
         }

      public Sona382(String s)
         {
            System.out.println(s);
         }

     public static void main(String[] args)
        {
           Sona382 s = new Sona382();
        }
  } 

       
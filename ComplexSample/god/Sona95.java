class A
   {
      public void act(A a)
         {
            System.out.println("Class A");
         }
  }

class B extends A
   {
      public void act(B b)
         {
            System.out.println("Class B");
         }
  }

class C extends A
   {
      public void act(C c)
         {
            System.out.println("Class C");
         }
  }

public class Sona95
   {
            public static void main(String[] args)
              {
                  A a=new A();
                  B b=new B();
                  C c=new C();
                  
                  A d=new C();
                  d.act(a);
                  d.act(b);
                  d.act(c) ;
             }
 }

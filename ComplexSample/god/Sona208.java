class A
  {
      public A() {}
     public A(int a)
       {
          System.out.println("constructor in A");
       }
  }

public class Sona208 extends A
  {
       public Sona208 () {} 
       public Sona208(int a)
        {
            System.out.println("constructor in Sona208");
        }

     public static void main(String[] args)
       {
          A a=new Sona208(10);
       }

 }  
class A
  {
     protected int size;

     public String toString()
       {
          return ""+size;
       }
  }

class B extends A
  {
     public B(int a)
       {
          size=a;
          System.out.println(size);
       }
 }

class C extends A
  {
     public C(int a)
       {
           size=a;
           System.out.println(size);
       }
  }

public class Sona96
  {
     public static void main(String[] args)
       {
          A a=new B(100);
          A b=new C(200);
       }
 }  
 
   
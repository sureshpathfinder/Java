abstract class A
  {
     final int a=10;
     
     final void display()
       {
           System.out.println("Is final allowed in abstract");
       }
  }


public class Sona146 extends A
  {   
     public static void main(String[] args)
       {
           Sona146 s=new Sona146();
           System.out.println(s.a);
           s.display(); 
       }
  } 
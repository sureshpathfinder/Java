abstract class A
  {
     public abstract void act();
  }

abstract class B extends A
  {
     public abstract void display();
  }

 public class Sona129 extends B
   {
      public void display()
        {
           System.out.println("Bata");
        }
 
     public static void main(String[] args)
       {
          Sona129 s=new Sona129();
           s.display();
       }
  }    
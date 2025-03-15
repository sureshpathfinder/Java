interface A
  {
     public abstract void act();
  }

abstract class B
  {
     public abstract void act();
  }

public class Sona130 extends B implements A
  {
     public void act()
        {
           System.out.println("Sony");
        }
 
     public static void main(String[] args)
       {
          Sona130 s=new Sona130();
          s.act();
       }
  } 
           
abstract class A
  {
     public abstract void act();
  }

interface B
  {
     public abstract void act();
  }

public class Sona109 extends A implements B
  {
     public void act()
       {
          System.out.println("act method");
       }
    
    public static void main(String[] args)
      {
          Sona109 s=new Sona109();
          s.act();
      }
 }   
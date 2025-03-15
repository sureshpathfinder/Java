abstract class A
  {
     public abstract void act();

     public void display()
       {
           System.out.println("display method");
       }
  }

public class Sona104 extends A
  {
     public void act()
       {
          System.out.println("act method");
       }

    public void show()
      {
         Sona104 s=new Sona104();
          s.act();
      }

  public static void main(String[] args)
     {
        Sona104 s=new Sona104();
        s.show();
     }
 }

class A
{
  public void display()
  {
     System.out.println("class A");
  }
}

public class Sona313 extends A
{
     public void act()
     {
        display();
     }
    public static void main(String ar[])
    {
       Sona313 a=new Sona313();
       a.act();
   }
}
abstract class A
{
  public abstract void act();
}

class B extends A
{
  public void act()
   {  }
}

public class Sona292
{
  public static void main(String ar[])
  {
     A a=new B();
     a.act();
  }
}     
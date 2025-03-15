private class Base
{
  Base()
  {
     int i = 100;     
     System.out.println(i);
  }
}

public class Sona302 extends Base
{
  static int i = 200;
  public static void main(String argv[])
  {
        Sona302 p = new Sona302();
        System.out.println(i);
  }
}

public class Sona319
{
  public String name = "Outer";
  public static void main(String argv[])
  {
        Inner i = new Inner();
        i.showName();
  }

  private class Inner
  {
        String name =new String("Inner");
        void showName()
       {
           System.out.println(name);
       }
  }
}


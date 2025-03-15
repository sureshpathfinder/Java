public class Sona265 extends Thread
{
  public static void main(String ar[])
  {
    Sona265 a=new Sona265();
    a.run();
     System.out.println("run");
     a.start();
      System.out.println("start");
  }
  public void run()
  {
    int i;
    for(i=0;i<5;i++)
    {
      System.out.println(i);
    }
 }
}  

class sam_thr
{
  public static void main(String s[])
  {
    try
    {
    for(int i=0;i<5;i++)
     {
      Thread.sleep(1000);
      System.out.println(i);
      }
     }
    catch(InterruptedException e)
    {
    }
  }
}    
    
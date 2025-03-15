public class Thread2
{  
  public static void main(String args[])
  {
    Using_Runnable m1=new Using_Runnable("Thread started..!");
  }
}

class Using_Runnable implements Runnable
{
  
  String s=null;
  Using_Runnable(String s1)
  {
    s=s1;
    Thread t=new Thread(this);
    t.start();
  }
  public void run()
  {
      System.out.println(s);
   }
}

 
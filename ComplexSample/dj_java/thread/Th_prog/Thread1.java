public class Thread1
{
  public static void main(String args[])
  {
   String t="Thread started..!";
   Using_Thread m1=new Using_Thread(t);
   }
}

class Using_Thread extends Thread
{
  String s=null;
  Using_Thread(String s1)
  {
    s=s1;
    start();
  }
  public void run()
  {
      System.out.println(s);
    }
}

 
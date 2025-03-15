public class SynStatement_State
{
 public static void main(String args[])
 {
  Share1 s=new Share1();
  MyThread m1=new MyThread(s,"Thread1");
  MyThread m2=new MyThread(s,"Thread2");
  MyThread m3=new MyThread(s,"Thread3");
 }
}

class MyThread extends Thread
{
 Share1 s;
 MyThread(Share1 s,String str)
 {
  super(str);
  this.s=s;
  start();
 }
 public void run()
 {
  s.doword(Thread.currentThread().getName());
 }
}


class Share1
{
 public void doword(String str)
 {
  synchronized(this)
  {
  for(int i=0;i<5;i++)
  {
  System.out.println("Started   :"+str);
  try
  {
   Thread.sleep(100);
  }
  catch(Exception e){  }
  }
  }
 }
}
public class SynThread_Method
{
 public static void main(String args[])
 {
  Share s=new Share();
  MyThread1 m1=new MyThread1(s,"Thread1");
  MyThread1 m2=new MyThread1(s,"Thread2");
  MyThread1 m3=new MyThread1(s,"Thread3");
 }
}

class MyThread1 extends Thread
{
 Share s;
 MyThread1(Share s,String str)
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

class Share
{
 public synchronized void doword(String str)
 {
  for(int i=0;i<5;i++)
  {
  System.out.println("Started   :"+str);
  try
  {
   Thread.sleep(100);
  }
  catch(Exception e){ }
  }
 }
}
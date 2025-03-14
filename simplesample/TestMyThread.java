class MyThread extends Thread
{
MyThread()
{
super("using thread class");
System.out.println("child thread:"+this);
start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("child thread"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
}
System.out.println("exiting child thread...");
}
}
class TestMyThread
{
public static void main(String args[])
{
new MyThread();
try
{
for(int k=5;k>0;k--)
{
System.out.println("Running main thread:"+k);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
}
System.out.println("exiting main thread...");
}
}

class IntThread implements Runnable
{
Thread t;
IntThread()
{
t=new Thread(this,"Test thread");
System.out.println("child thread:"+t);
t.start();
}
public void run()
{
try
{

for(int i=5;i>0;i--)
{
System.out.println("child thread:"+i);
t.sleep(100);
System.out.println(t.getPriority());
}
}
catch(InterruptedException e)
{
}
System.out.println("Exiting child thread");
}
public static void main(String args[])
{
IntThread i=new IntThread();
try
{
for(int j=5;j>0;j--)
{
System.out.println("Main thread:"+j);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
}
System.out.println("Main thread exiting");
}
}

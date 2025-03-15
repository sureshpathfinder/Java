import java.io.*;
class thread1
{
synchronized void multi(int x)
{
System.out.println("\t \t THREAD IMPLEMENTATION USING SYNCHRONIZATION \n");
for(int i=1;i<=10;i++)
{
System.out.println(x+"*"+i+"="+(x*i));
}
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception");
}
System.out.println("\n Child Exist \n");
}
}
class thread2 implements Runnable
{
int x;
thread1 ts;
Thread t;
public thread2(thread1 th,int y)
{
ts=th;
x=y;
t=new Thread(this);
t.start();
}
public void run()
{
ts.multi(x);
}
}
class threadsynch
{
public static void main(String args[])
{
thread1 i=new thread1();
thread2 j=new thread2(i,5);
thread2 k=new thread2(i,6);
thread2 h=new thread2(i,7);
try
{
j.t.join();
k.t.join();
h.t.join();
}
catch(InterruptedException e)
{
System.out.println("Int Exp");
}
}
}

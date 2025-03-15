public class bothinmethod
{
synchronized public void doStuff(int val)
{
print("entering doStuff()");
int num=val*2;
print("In doStuff()-localVariable="+num);
try{Thread.sleep(2000);}
catch(InterruptedException ie)
{}
print("Leaving doStuff()");
}
synchronized public void print(String msg)
{
String threadname=Thread.currentThread().getName();
System.out.println(threadname+":"+msg);
}
public static void main(String args[])
{
final bothinmethod bim=new bothinmethod();
Runnable runA=new Runnable()
{
public void run()
{
bim.doStuff(9);
}
};
Thread threadA=new Thread(runA,"threadA");
threadA.start();
try
{
Thread.sleep(200);
}catch (InterruptedException e){}
Runnable runB=new Runnable()
{
public void run()
{
bim.doStuff(6);
}
};
Thread threadB=new Thread(runB,"threadB");
threadB.start();

}
}

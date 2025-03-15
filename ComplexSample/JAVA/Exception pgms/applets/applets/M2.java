class M1 extends Thread
{
M1()
{
Thread t;
t=new Thread(this,"1st thread");
t.start();
}
public void run()
{
threadmet();
notify();
}
public String synchronized threadmet()
{
System.out.println("candidate inside");
}
}
class M2 extends Thread
{
M2()
{
Thread t;
t=new Thread(this,"2nd thread");
t.start();
}
public void run()
{
try
{
t.sleep(1000);
}
catch(InterruptedException e)
{
}
display();
}
public String synchronized display()
{
System.out.println("now u can enter the interview hall");
}

public static void main(String args[])
{
M2 a=new M2();
M1 b=new M1();
}
}
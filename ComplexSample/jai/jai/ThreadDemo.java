
class Thread1
{
	Thread1()
	{
		System.out.println("Thread starts here");
	}
	synchronized void table(int x)
	{
		try
		{
			for (int i = 1; i <= 10; i++)
			{
				System.out.println(x + "*" + i + "=" + x * i);
			}
			Thread.sleep(1000);
		}
		catch (InterruptedException i) { System.out.println(i); }
	}
}
class Thread2 extends Thread
{
	int x;
	Thread1 m;
	Thread2(Thread1 n,int a)
	{
		m = n;
		x = a;
		
	}
	public void run()
	{
		m.table(x);
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		Thread1 t = new Thread1();
		Thread2 t1 = new Thread2(t,5);
		Thread2 t2 = new Thread2(t,6);
		Thread2 t3 = new Thread2(t,7);
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		}
}
class Stock
{
int goods=0;
public synchronized void addStock(int i)
{
goods=goods+i;
System.out.println("stock added:"+i);
System.out.println("present stock:"+goods);
notify();
}
public synchronized int getStock(int j)
{
while(true)
{
if(goods>=j)
{
goods=goods-j;
System.out.println("stock taken away:"+j);
System.out.println("present stock:"+goods);
break;
}
else
{
System.out.println("stock not enough");
System.out.println("waiting for stocks to come");
try
{
wait();
}
catch(InterruptedException e)
{
}
}
}
return goods;
}
public static void main(String args[])
{
Stock j=new Stock();
Producer p=new Producer(j);
Consumer d=new Consumer(j);
try
{
Thread.sleep(1000);
p.stop();
d.stop();
p.t.join();
d.t.join();
System.out.println("Thread stopped");
}
catch(InterruptedException e)
{
}
System.exit(0);
}
}








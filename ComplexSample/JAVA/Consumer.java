class Consumer implements Runnable
{
Stock d;
Thread t;
Consumer(Stock d)
{
this.d=d;
t=new Thread(this,"consumer thread");
t.start();
}
public void run()
{
while(true)
{
try
{
t.sleep(750);
}
catch(InterruptedException e)
{
}
d.getStock((int)(Math.random()*100));
}
}
void stop()
{
t.stop();
}
}
 
class thread1 extends Thread
{
  public void run()
  {
    
    for(int i=0;i<10;i++)
    {
      System.out.println(this.getName());
    }
  }
  public static void main(String ar[])
  {
    thread1 t=new thread1();
    t.start();
    t.setName("c");
    t.setPriority(5);
    thread1 t1=new thread1();
    t1.start();
    t1.setName("a");
    t1.setPriority(Thread.MAX_PRIORITY);
 
    for(int i=0;i<10;i++)
    {
       System.out.println("M");
    }
  }
}
    
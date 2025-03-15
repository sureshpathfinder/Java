class thread1 implements Runnable
{
  public void run()
  {
    
    for(int i=0;i<10;i++)
    {
      System.out.println(i+" ");
       try{
    Thread.sleep(1000);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
 
     
    }
  }
  public static void main(String ar[])
  {
    
    Thread t=new Thread(new thread1());
    t.start();
    try{
      for(int i=0;i<10;i++)
    {
       System.out.println("M");
        Thread.sleep(1000);
    }
   
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    
  }
}
    
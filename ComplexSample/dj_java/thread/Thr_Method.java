 class Thr_Method 
{
  public static void main(String args[ ])
  {
     ChildThread c=new ChildThread();
     MainThread c1=new MainThread();
     c.start();
     c.setName("Child");
     c1.setPriority(2);
     c1.start();
     c1.setName("Main");
     System.out.println("Name of First Thread = "+c1.getName());   
     System.out.println("Name of Second Thread="+c.getName());
     System.out.println(" Main Thread is alive="+c1.isAlive());
     System.out.println("Child Thread is alive ="+c.isAlive());
     
  }
}
 
 class MainThread extends Thread
 {
    public void run()
   {
           for ( int i=0; i<=5; i++)
      {
        System.out .println( "Main Thread: "+i);
        try
        {
          Thread.sleep(1000);
          
        }
        catch(Exception ex)
        {
          System.out .println( "Main Thread Interrupted"+ex ) ;
        }
      }
      System.out .println( "Finished . . . " ) ;
   }
 }
      

class ChildThread extends Thread
{
  public void run()
  {
    
    for(int i=0;i<3;i++)
    {
      try
    {
      System.out.println("Child Thread :"+i);
      Thread.sleep(2000); 
    }
    catch(Exception e)
    {}
    }
  }
}
    
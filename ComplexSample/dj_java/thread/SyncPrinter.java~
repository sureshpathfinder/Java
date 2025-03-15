class SyncPrinter
{
  public static void main(String args[])
  {
    printer p=new printer();
    user u1=new user(p,1,10,1000);
    user u2=new user(p,26,30,2000);
    user u3=new user(p,41,45,1500);
    u1.start();
    u2.start();
    u3.start();
  }
}

class printer
{
   synchronized void print( int start,int end,int delay)
    {
    System.out .println( " [ " ) ;
    for(int i=start ; i<=end; i++)
    {
      System.out .println( " "+i ) ;
      try
      {
        Thread. sleep(delay);
      }
      catch(Exception ex)
      {
        System.out .println( "Thread Interrupted" ) ;
      }
    }
    System.out .println( " ] " ) ;
  }
}


class user extends Thread
{
  printer p;
  int start ,end,delay;
  user (printer p, int start , int end, int delay)
  {
    this.p=p;
    this. start=start;
    this.end=end;
    this.delay=delay;
  }
  public void run( )
  {
    synchronized(p)
    {
      p.print(start ,end,delay) ;
    }
  }
}


class Run_Inter_din
{
  public static void main(String args[ ])
  {
     Thread t1 = new Thread() ;
     Thread t2 = new Thread() ;
     t2. start() ;
     t1. start() ;
  }
}

class first implements Runnable
{
  public void run( )
  {
    for(int i=1; i<=5; i++)
    {
      System.out.println( "First : "+i ) ;
      try
      {
        Thread. sleep(1000) ;
      }
      catch( InterruptedException ex)
      {
        System.out.println( "First Interrupted" ) ;
      }
    }
  }
}

class second implements Runnable
{
  public void run( )
  {
    for (int i=30;i>=26;i--)
    {
      System.out.println( " Second: "+i ) ;
      try
      {
        Thread. sleep(2000) ;
      }
      catch( InterruptedException ex )
      {
        System.out.println( "Second Interrupted" ) ;
      }
    }
  }
}



class First_Thread
{
  public static void main(String args[ ])
  {
    //Thread r=Thread.currentThread() ; //main Thread
      for ( int i=0; i<=10; i++)
      {
        
        System.out .println( "Count is: "+i );
        try
        {
         // r.sleep(1000);
         Thread.sleep(2000);
        }
        
        catch(InterruptedException ex)
        {
          System.out .println( "Main Thread Interrupted"+ex ) ;
        }
      }
      System.out .println( "Finished . . . " ) ;
  }
}
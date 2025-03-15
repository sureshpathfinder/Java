class Multi_Thread_Din
{
public static void main(String args[ ])
{
FirstThread f = new FirstThread( ) ;
SecondThread s = new SecondThread( ) ;
s.start( );
f.start( );
}
}

class FirstThread extends Thread
{
public void run( )
{
  try
{
for (int i=1; i<=10; i++)
{
System.out .println("First Thread: "+i) ;
Thread. sleep(1000);
}
}
catch(Exception ex )
{
System.out .println( "First Thread Interrupted" ) ;
}
}
}



class SecondThread extends Thread
{
public void run( )
{
  try
{
for (int i=30;i>=26;i--)
{
System.out .println("Second Thread: "+i);

Thread. sleep(2000);
 }
}
catch(Exception ex)
{
System.out .println( "Second Thread Interrupted" ) ;
}
}
}



//Thread using Runnable interface
class thread1 implements Runnable
{
        Thread t;
        thread1()
        {
                t=new Thread(this,"Test Thread");
                System.out.println("Child Thread : "+t);
                t.start();
        }
        public void run()
        {
                try
                {
                        for(int i=5;i>0;i--)
                        {
                                System.out.println("Child thread: "+i);
                                Thread.sleep(1000);
                        }
                }catch(InterruptedException e)
                {
                }
                System.out.println("Exiting Child Thread ....");
        }
        public static void main(String ar[])
        {
                thread1 i=new thread1();
                try
                {
                        for(int j=5;j>0;j--)
                        {
                                System.out.println("Main thread: "+j);
                                Thread.sleep(1000);
                        }
                }catch(InterruptedException e)
                {
                }
                System.out.println("Exiting Main Thread ....");
        }
}

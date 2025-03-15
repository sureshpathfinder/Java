//Creation of Thread object Using Thread class
class thread2 extends Thread
{
        thread2()
        {
                super("Using thread class");
                System.out.println("Child Thread : "+this);
                start();
        }
        public void run()
        {
                try
                {
                        for(int i=5;i>0;i--)
                        {
                                System.out.println("Child thread: "+i);
                                Thread.sleep(500);
                        }
                }catch(InterruptedException e)
                {
                }
                System.out.println("Exiting Child Thread ....");
        }
        public static void main(String ar[])
        {
                new thread2();
                try
                {
                        for(int j=5;j>0;j--)
                        {
                                System.out.println("Runnig Main thread: "+j);
                                Thread.sleep(1000);
                        }
                }catch(InterruptedException e)
                {
                }
                System.out.println("Exiting Main Thread ....");
        }
}

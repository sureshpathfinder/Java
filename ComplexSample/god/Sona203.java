public class Sona203 extends Thread
  {
      public void run()
        {
           for(int i=1;i<4;i++)
             {
                System.out.println(i);
             }
        }

      public static void main(String[] args)
        {
            Sona203 s=new Sona203();
            s.start();
        }

     synchronized void act() throws Exception
       {
           Thread.sleep(1000);
       }
 }  
public class Sona204 extends Thread
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
            Sona204 s=new Sona204();
            s.start();
        }

      void act()  throws Exception
       {
           wait();
       }
 }  
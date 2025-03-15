class th_sleep extends Thread
 {
        public void run()
        {
          try
          {
            for(int i=1;i<5;i++)
            {
              for(int j=3;j<4;j++)
              {
                System.out.println("THE VALUE IN RUN IS:  "+(i*j));
              }
              Thread.sleep(1500);
            }
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
        }
        public static void main(String args[])
        {
                th_sleep th1 = new th_sleep();
                 try
                 {
                   for(int i=1;i<5;i++)
                   {
                     if(i==1)
                     {
                       th1.start();
                     }
                     for(int j=5;j<6;j++)
                     {
                       System.out.println("THE VALUE IN MAIN IS:  "+(i*j));
                     }
                     Thread.sleep(1000);
                   }
                 }
                 catch(Exception e)
                 {
                   System.out.println(e);
                 }
        }
}


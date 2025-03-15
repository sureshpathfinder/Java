 public class Sona280 extends Thread
  {
      public void run()
        {
            for(int i=1;i<=15;i+=2)
              {
                  System.out.println(i);
              }
        }

      public static void main(String[] args)
         {
             Sona280 a=new Sona280();
             a.start();
         
             for(int i=2;i<=16;i+=2)
                {
                    System.out.println(i);
                }
         }
    }     
public class Sona152 extends Thread
  {
     public static void main(String[] args)
       {
           Sona152 s=new Sona152();
           s.start();
       }

     public int run()
       {
          for(int i=0;i<5;i++)
            {
               System.out.println("JDBC"+"     "+i);
            }
          return 0;
       }
  } 
      
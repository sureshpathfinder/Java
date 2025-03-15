public class Sona149 implements Runnable
  {
     public static void main(String[] args)
       {
          Sona149 s=new Sona149();
          Thread t=new Thread(s);
          //Thread t1=new Thread(s);
          t.start();
          t.start();
          //t.stop();
          //t1.start();
       }

     public void run()
       {
          for(int i=0;i<5;i++)
            {
                System.out.println("Java"+"   "+i);
            }
       } 
 }          
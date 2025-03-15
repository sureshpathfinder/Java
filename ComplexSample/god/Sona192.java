public class Thread
  {
     public void run()
       {
          System.out.println("ORACLE");
       }

     public static void main(String[] args)
       {
          Thread t=new Thread();
           t.run();
       }
  } 
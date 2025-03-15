public class Sona166 extends Thread
  {
      public void run()
        {
           System.out.println("In run");
 
            suspend();
            resume();

            System.out.println("Heaving run");
        }

     public static void main(String[] args)
       {
             (new Sona166()).start(); 
               
     }
 }

 
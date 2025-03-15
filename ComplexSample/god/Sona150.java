public class Sona150 extends Thread
  {
      public static void main(String[] args)
        {
            Sona150 s=new Sona150();
            s.start();
            s=null;
        }

      public void run()
        {
           for(int i=0;i<5;i++)
             {  
                  System.out.println("Servlets"+"    "+i);
                  
             }
       }
  }   
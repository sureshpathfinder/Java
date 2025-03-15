class A implements Runnable
  {
     public void run()
       {
          for(int i=0;i<5;i++)
            {
               System.out.println("JSP"+"    "+i);
            }
       }

     public void run(String s)
       {
          for(int i=0;i<5;i++)
            {
                System.out.println("EJB"+"    "+ i);
            }
       }
  }

public class Sona151
  {
     public static void main(String[] args)
       {
           A a=new A();
           Thread t=new Thread(a); 
           t.start();
           
      }
  }   
 class A implements Runnable
    {
         public static void main(String[] args)
           {
               A a=new A();
               Thread t=new Thread(a);
               t.start();
           }

        public void run()
          {
             for(int i=1;i<4;i++)
               {
                  System.out.println("Super Class"+"    "+i);
               }
          }
    }
                  
public class Sona193 extends A implements Runnable
   {
       public static void main(String[] args)
         {
            Sona193 s=new Sona193();
            Thread t=new Thread(s);
             t.start();
         }

       public void run()
        {
           for(int i=1;i<4;i++)
             {
                System.out.println("Sub Class"+"  "+i);
             }
       }
  }

   
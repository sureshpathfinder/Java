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
                  
public class Sona195 extends A implements Runnable
   {
       public static void main(String[] args)
         {
             Sona195 s=new Sona195();
             Thread t=new Thread(s);
             t.start();

            A a=new A();
            Thread t1=new Thread(a);
            t1.start();   
         }

       public void run()
        {
           for(int i=1;i<4;i++)
             {
                System.out.println("Sub Class"+"  "+i);
             }
       }
  }

   
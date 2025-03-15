public class Sona200 extends Thread
  {
     protected String s="Hi";
      
     public static void main(String[] args)
       {
          Sona200 a=new Sona200();
          a.act(a.s);
         start();
       }

     public void act(String ss)
       {
           s=ss+"welcome";
                  }

    public void run()
      {
         for(int i=1;i<=4;i++)
           {
               System.out.println(i);
           }
      }
 }          
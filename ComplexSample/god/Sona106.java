public class Sona106
  {
     public void act() throws ArithmeticException
       {
          int a=4/0;
          System.out.println(a);
       }

     public static void main(String[] args)
       {
         Sona106 s=new Sona106();
         s.act();
       }
 }
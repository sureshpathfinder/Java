public class Sona201
  {
     int a=10;
     static int b=20;
 
     public void act(int g)
       {
          System.out.println(g);
          System.out.println(b); 
       }

     public static void display(int h)
       {
          System.out.println(h);
       }

    public static void main(String[] args)
      {
         Sona201 s=new Sona201();

         s.act(a);
         s.display(b);

         s.act(b);
         s.display(a);
     }
 }   
public class Sona189
  {
     public void act(Object o)
       {
          System.out.println(o);
       }

     public void act(String s)
       {
          System.out.println(s);
       }

   public static void main(String[] args)
      {
         Sona189 s=new Sona189();
         s.act(null);
      }
  } 
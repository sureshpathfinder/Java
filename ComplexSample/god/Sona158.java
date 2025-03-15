public class Sona158
  {
     public void display(String s,StringBuffer sb)
       {
          System.out.println(s);
       }

    public void display(StringBuffer sb,String s)
      {
         System.out.println(s);
      }

   public static void main(String[] args)
      {
         StringBuffer sb=new StringBuffer("hai");

         Sona158 s=new Sona158();
         s.display("hello",sb);
      }
  }
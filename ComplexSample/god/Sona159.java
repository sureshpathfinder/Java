public class Sona159
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
         Sona159 s=new Sona159();
         s.display("hai","hello");
      }
  } 
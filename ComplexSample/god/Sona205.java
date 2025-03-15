public class Sona205
  {
      Sona205()
        {
           System.out.println("Constructor 1");
        }

      public Sona205(int a)
        {
           System.out.println("Constructor 2");
        }

     private Sona205(int a,int b)
       {
          System.out.println("Constructor 3");
       }

     protected Sona205(int a,int b,int c)
       {
           System.out.println("Constructor 4");
       }

      public static void main(String[] args)
        {
            Sona205 s1,s2,s3,s4;
            s1=new Sona205();  
            s2=new Sona205(10);
            s3=new Sona205(10,20);
            s4=new Sona205(10,20,30);
       }  
  }

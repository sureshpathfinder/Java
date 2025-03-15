public class Sona161
  {
     public static void main(String[] args)
       {
          //  idea of class variable (static ) 
          Sona160 s1=new Sona160();

          System.out.println(Sona160.a);
          System.out.println(s1.a);

          s1.a=20;
          Sona160 s2=new Sona160();
          
          System.out.println(Sona160.a);
          System.out.println(s2.a);

         //  idea of instance variable
        Sona160 s3=new Sona160();
        System.out.println(s3.b);

        s3.b=20;
        Sona160 s4=new Sona160();

        System.out.println(s4.b);   
      }
  }
              
         
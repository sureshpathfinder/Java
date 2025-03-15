 public class Sona61
  {
     public static void main(String[] args)
       {
          StringBuffer sb1=new StringBuffer("Hello");
          StringBuffer sb2=new StringBuffer("Welcome"); 

          method(sb1,sb2);
	 System.out.println(sb1.append(sb2));
      }

    static void method(StringBuffer s1,StringBuffer s2)
       {
           s1=s1.append("hello");
           s2=s1;

      }
  }
  
public class Sona73
  {
     public static void main(String[] args)
       {
           String s1="abc";
           String s2="def";
        
           s1.concat(s2);
           s1=null;

           s1+=s2;
           System.out.println(s1);
       }
  }   
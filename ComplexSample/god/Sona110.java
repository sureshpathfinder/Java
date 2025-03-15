interface A
  {
     public static int a=10;
  }

interface B
  {
     public static int a=20;
  }

public class Sona110 implements A,B
  {
     public static void main(String[] args)
      {
          System.out.println(a);
      }
 }
 
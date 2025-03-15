public class Sona52
  {
     public static void main(String[] args)
        {
           Long a=new Long(9);
           Long b=new Long(9);
           Long c=b;

           long d=9;
           long e=9;

          // which are legal

          a==b;
          a==c;
          b==c;
          d==a;
          d==e;
      }
  }
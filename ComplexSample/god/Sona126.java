public class Sona126
  {
     public static void main(String[] args)
       {
          try
            {
               int a=4/0;
               System.out.println(a);
            }

           catch(ArithmeticException e)
             {
                 throw new ArithmeticException("Please kindly see the number you have entered");
             }
       }
 } 
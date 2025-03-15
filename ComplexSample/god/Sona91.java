public class Sona91
   {
       public static void main(String[] args)
         {
             try
                {
                   System.out.println("the value is :"+(1/0));
                }
             
            catch(ArithmeticException e)
               {
                 System.out.println("Exception");
                 return;
               }

           finally
            {
               System.out.println("Finally");
            }
         }
  }
              
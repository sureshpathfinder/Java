public class Sona132
  {
     public static void main(String[] args)
       {
          try
            {
                int a=4/0;
            }

            catch(ArithmeticException ae)
              {
                  try
                    {
                       int a=4/0;
                    }
                  catch(Exception e)
                    {
                        System.out.println("Samsung");
                    }
              }
        }
 }   
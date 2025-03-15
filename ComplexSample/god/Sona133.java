public class Sona133
  {
     public static void main(String[] args)
       {
          try
            {
               int a=4/0;
            }

          finally
            {
                try
                  {
                     int a=4/0;
                     System.out.println(a);
                  }
                finally
                 {
                    System.out.println("Inner finally");
                 }
            }
       }
  }  
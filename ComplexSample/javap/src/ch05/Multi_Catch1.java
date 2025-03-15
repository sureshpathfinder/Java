public class Multi_Catch1
{
     public static void main (String args[])
       {
        int array[]=new int [5];
        int num1=15,num2=2;
        int res=0;
      try
      {
         res = num1/num2;
        System.out.println("The result is" +res);

        for(int ct =0;ct <=5; ct++)
        {
           array[ct] = ct * ct ;
       }
    }
          catch (ArrayIndexOutOfBoundsException e)
       {
         System.out.println("Assigning the array beyond the upper bound");
        }

     catch (ArithmeticException e)
         {
           System.out.println ("Can't be divided by Zero");
         }
      }
    }

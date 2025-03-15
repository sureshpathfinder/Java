public class Multi_Catch
{
     public static void main (String args[])
       {
        int array[]={20,10,30};
        int num1=15,num2=0;
        int res=0;
      try
      {
         res = num1/num2;
        System.out.println("The result is" +res);

        for(int ct =2;ct >=0; ct--)
        {
       System.out.println("The value of array are" +array[ct]);
       }

    }
          catch (ArrayIndexOutOfBoundsException e)
       {
         System.out.println("Error…. Array is out of Bounds");
        }

     catch (ArithmeticException e)
         {
           System.out.println ("Can't be divided by Zero");
         }
      }
    }
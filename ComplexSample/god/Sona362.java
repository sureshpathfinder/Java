import java.io.*;

 public class Sona362
{
   public static void main(String ar[])
   {
       int i=1,j=1;
       i++;
       --j;
       try
       {
            if(i/j>0)
               System.out.println("hai");
       }
        catch(IOException ae)
       {
             System.out.println("AOOBE");
        }
       catch(Exception ae)
       {
             System.out.println("AE");
        }

        finally
        {
             System.out.println("finally");
        }
        System.out.println("out of block");
    }
}
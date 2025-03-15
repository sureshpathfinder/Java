// Program to find given number is Amstrong number or not

import java.lang.System;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sona363
{
   public static void main(String a[]) throws IOException
   {
       String str;
       int n,i,f,sum=0;
       InputStreamReader p=new InputStreamReader(System.in);
       BufferedReader m=new BufferedReader(p);
       System.out.print("Enter the given number :");
       str=m.readLine();
       f=Integer.parseInt(str);
       while(f>=1)
       {
         i=f%10;
         f=f/10;
         sum+=(i*i*i);
       }
       f=Integer.parseInt(str);
       if(f==sum)
          System.out.println("The Given Number "+f+" is Amstrong Number");
       else
          System.out.println("The Given Number "+f+" is Not a Amstrong Number");
    }
}   // **** End of Program ****

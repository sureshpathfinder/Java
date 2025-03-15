//  Program to Find Factorial of given number

import java.lang.System;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sona364
{
   public static int fact(int i)
   {
      int j,s=1;
      for(j=1;j<=i;j++)
         s*=j;
      return(s);
    }
   public static void main(String a[]) throws IOException
   {
       String str;
       InputStreamReader p=new InputStreamReader(System.in);
       BufferedReader m=new BufferedReader(p);
       System.out.print("Enter the value to find factorial : ");
       str=m.readLine();
       int n,sum=0,i;
       n=Integer.parseInt(str);
       for(i=1;i<=n;i++)
           sum+=fact(i);
       System.out.println("The sum of Factorial is : "+sum);
    }
}   //  ****  End of Program  *****

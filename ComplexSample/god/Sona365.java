//  Program to display Fibonaci Series

import java.lang.System;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sona365
{
   public static void main(String a[]) throws IOException
   {
       String str;
       InputStreamReader n=new InputStreamReader(System.in);
       BufferedReader m=new BufferedReader(n);
       System.out.print("Enter the N Value : ");
       str=m.readLine();
       int f1,f2,f3,i,j;
       f1=0;
       f2=1;
       i=Integer.parseInt(str);
       System.out.println(f1+f2);
       for(j=1;j<=i;j++)
       {
           f3=f1+f2;
           System.out.println(f3);
           f1=f2;
           f2=f3;
       }
    }
}   //  ***** End of Program   *****

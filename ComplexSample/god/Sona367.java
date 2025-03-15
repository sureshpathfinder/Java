//  Program to find given number is Prime or not

import java.lang.System;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sona367
{
   public static void main(String a[]) throws IOException
   {
       String str;
       int n,i,f=0;
       InputStreamReader p=new InputStreamReader(System.in);
       BufferedReader m=new BufferedReader(p);
       System.out.print("Enter the given number : ");
       str=m.readLine();
       n=Integer.parseInt(str);
       for(i=2;i<n;i++)
       {
          if(n%i==0)
          {
             f=1;
             break;
          }
       }
          if(f==0)
              System.out.println("The Given Number "+n+" is Prime");
          else
              System.out.println("The Given Number "+n+" is Not Prime");
        }
 } //  *****  End of Program  ****

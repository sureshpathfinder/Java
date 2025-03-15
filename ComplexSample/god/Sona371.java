// Program to arrange names in alphabetical order

import java.io.*;
import java.lang.*;

public class Sona371
{
  public static void main(String arg[])
  {
    String names[]={"meer","vijay","amjad","durai"};
    String temp;
    int i,j;
    System.out.println("\nBEFORE ARRANGING ALPHABETICALS ORDER");
    System.out.println("====================================\n");
    for(j=0;j<4;j++)
      System.out.println(names[j]);
    for(i=0;i<4;i++)
    {
      for(j=i+1;j<4;j++)
      {
        if((names[i].compareTo(names[j])>=0))
        {
           temp=names[i];
           names[i]=names[j];
           names[j]=temp;
        }
      }
    }
    System.out.println("\nAFTER ARRANGING ALPHABETICALS ORDER");
    System.out.println("===================================\n");
    for(j=0;j<4;j++)
      System.out.println(names[j]);
  }
}

                        /* STRING MANIPULATION */

import java.io.*;
import java.lang.*;
class strmanip
{
        public static void main(String args[])throws IOException
        {
                char a[]=new char[100];
                char ch;
                int i=0,v=0,w=0,s=0,c=0,j=0;
                System.out.println("\n\t\t STRING MANIPULATION USING CHARACTER ARRAY\n");
                System.out.println("----------------------------------------------");
                System.out.println("\n Enter the string: \t");
                do
                {
                        ch=(char)System.in.read();
                        a[i]=ch;
                        i++;
                        switch(ch)
                        {
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                case 'A':
                                case 'E':
                                case 'I':
                                case 'O':
                                case 'U':
                                     v++;
                                   break;
                                   default:
                                   c++;
                                   break;
                          }
                          if(ch==' ')
                          {
                                s++;
                                w++;
                          }      
                   }while(ch!='\n');
                   w++;
                   System.out.print("\n\n\n Given String is :");
                   a[i]='\0';
                   for(i=0;a[i]!='\0';i++)
                   {
                        System.out.print(a[i]);
                   }
                   System.out.print("\n Length of the string:"+(i-2));
                   System.out.print("\n No of vowels in the string:"+v);
                   System.out.print("\n No of Constants in the String:"+(c-2));
                   System.out.print("\n No of Spaces in the String:"+s);
                   System.out.print("\n No of words in the String:"+w);
                   System.out.print("\n Reversed String is :\n\t");
                   for( j=i-1;j>=0;j--)
                   {
                        System.out.print(a[j]);
                   }
               }
}











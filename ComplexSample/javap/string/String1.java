import java.io.*;
import java.util.*;
import java.lang.String.*;
class String1
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int i,j,k,v=0,ch,flag=0;
  int word=1,num=0,space=0;
  char a1[];
  String s1,s2;
  System.out.println( " \n String Manipulation");
  System.out.println( " \n Enter a String ");
  s1=br.readLine();
  s1=s1.toUpperCase();
  a1=s1.toCharArray();
  do
  {
   System.out.println("\n 1.Length");
   System.out.println("\n 2.Palindrome");
   System.out.println("\n 3.Counting");
   System.out.println("\n 4.Substring");
   System.out.println("\n 5.Concatenation");
   System.out.println("\n 6.Exit");
   System.out.println("\n Enter your choice");
   ch=Integer.parseInt(br.readLine());
   switch(ch)
   {
     case 1:
              System.out.println("\n FINDING STRING Length");    
              System.out.println("\n The Length of String is:"+s1.length());
              break;
    case 2:
              System.out.println("\n Checking Palindrome");    
              for(i=0,j=a1.length-1;i<a1.length;i++,j--)
              {
               if(a1[i]!=a1[j])
               {
                 flag=1;
                 break;
              }
            }
   
         if(flag==0)
            System.out.println("Given the String is a Palindrome");
         else
            System.out.println("The Given the String is not a Palindrome");
         break;
   case 3:
             System.out.println("\n Analysis The String");  
             for(i=0;i<a1.length;i++)
             {
              if(a1[i]=='A' || a1[i]=='E' || a1[i]=='I' || a1[i]=='O' || a1[i]=='U')
                  v++;
              if(a1[i]==' ')
              {
               space++;
               word++;
              }
             if(a1[i]=='0' || a1[i]=='1' || a1[i]=='2' || a1[i]=='3' || a1[i]=='4' || a1[i]=='5' || a1[i]=='6' || a1[i]=='7' || a1[i]=='8' || a1[i]=='9'){
               num++;System.out.println(a1[i]);}
             }
             System.out.println("Vowels:"+v); 
	     System.out.println("Words:"+word); 
	     System.out.println("Space:"+space); 
             System.out.println("Numbers:"+num);  				
             break;
   case 4:
           System.out.println("Extract Substring"); 
	   System.out.println("Enter the Starting Position"); 
           i=Integer.parseInt(br.readLine()); 
	   System.out.println("Enter the Ending Position");
           j=Integer.parseInt(br.readLine()); 
           s2=s1.substring(i-1,j);
	   System.out.println("Substring of"+s1+" is "+s2); 
           break;

    case 5:
             System.out.println("\n Concatenation With another String"); 
 	     System.out.println("Enter the 2 string:"); 
	     s2=br.readLine();
	     s2=s2.toUpperCase();
	     System.out.println("First String:"+s1); 
             System.out.println("Second String:"+s2); 
	     System.out.println("The Concatenated String is:"+s1.concat(s2));   
   }
 }while(ch<=5);
 }
}
                  
  
   
   
 





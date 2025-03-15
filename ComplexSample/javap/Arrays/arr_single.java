import java.io.*;
class arr_single
{
public static void main(String args[])throws IOException
{
int a[]=new int[10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 5 values");
for(int i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The 5 values are");
for(int i=0;i<5;i++)
{
System.out.print("   "+a[i]);
}
 
/*for Each
System.out.println("\n FOR Each");
for(int n:a)
{
System.out.print("   "+n);
}

System.out.println(" \n FOR Each");
int m=1;
for(;m<4;)
{
System.out.print("   "+m);
m++;
}
*/

System.out.println("\n end");
}
}

import java.util.*;
class throweg
{
public static void main(String args[])throws Exception
{
int a[]=new int[10];
float t=0;
Exception ae=new Exception();
Scanner s=new Scanner(System.in);
System.out.println("Enter the marks");
try
{
for(int i=0;i<5;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<5;i++)
{
if(a[i]<0||a[i]>100)
{
System.out.print("At position"+(i+1));
throw ae;
}
}
}
catch(Exception e)
{
System.out.println(" the mark is not with in the range");
}
finally
{
for(int i=0;i<5;i++)
t=t+a[i];
System.out.println("Average="+(t/5));
}
}
}
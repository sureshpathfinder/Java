import java.util.*;
class  Alpha
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
String  a[]=new String[5];
for(int i=0;i<5;i++)
{
a[i]=s1.next();
}
for(int i=0;i<a.length;i++)
for(int j=i+1;j<a.length;j++)
if(a[i].compareTo(a[j])>0)
{
String s=a[i];
a[i]=a[j];
a[j]=s;
}
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
}
import java.io.*;
class A
{
int l,b;
void disp(int x,int y)       
{
l=x;
b=y;
System.out.println("length="+l);
System.out.println("breadth="+b);
}
}
class B extends A
{
int volume()
{
return(l*b);
}
}
class inher
{
public static void main(String args[])throws IOException
{
int m,n;
DataInputStream ds=new DataInputStream(System.in);
System.out.println("\n Enter the values of m:");
m=Integer.parseInt(ds.readLine());
System.out.println("\n Enter the values of n:");
n=Integer.parseInt(ds.readLine());
B x2=new B();
x2.disp(m,n);
System.out.println("Area of rectangle="+x2.volume());
}
}
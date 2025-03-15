import java.io.*;
class Rect
{
protected int l,b;
void get(int a,int c)
{
l=a;
b=c;
}
void area()
{
System.out.println("Area of rectangle="+(l*b));
}
}
class Cuboid extends Rect
{
int h;
void get1(int a)
{
h=a;
}
void volume()
{
System.out.println("Volume of cuboid ="+(l*b*h));
}
}
class Inherit
{
public static void main(String args[])throws IOException
{
Cuboid c=new Cuboid();
BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
String s=br.readLine();
int a=Integer.parseInt(s);
String s1=br.readLine();
int b=Integer.parseInt(s1);
String s2=br.readLine();
int c1=Integer.parseInt(s2);
c.get(a,b);
c.get1(c1);
c.area();
c.volume();
}
}
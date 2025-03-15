class Rect
{
int l,b;
Rect(int c,int d)
{
l=c;
b=d;
}
void area()
{
System.out.println("Area="+(l*b));
}
}
class Cuboid extends Rect
{
int h;
Cuboid(int a,int b,int c)
{
super(a,b);
h=c;
}
void area()
{
super.area();
System.out.println("volume="+(l*b*h));
}
}
class J
{
public static void main(String args[])
{
Cuboid c=new Cuboid(10,20,30);
c.area();

}
}
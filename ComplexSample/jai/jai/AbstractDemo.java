class Rectangle extends Shape
{
void area(int l,int b)
{
System.out.println("Areaof rectangle="+(l*b));
}
}
class Triangle extends Shape
{
void area(int b,int h)
{
System.out.println("Area of triangle="+(.5*b*h));
}
}
class AbstractDemo
{
public static void main(String args[])
{
Shape s;                    //object reference
Rectangle r=new Rectangle();
Triangle t=new Triangle();
s=r;
s.get();
r.area(8,5);
t.area(6,4);
}
}
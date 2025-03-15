class Point1
{
int x,y;
void init(int x,int y)
{
this.x=x;
this.y=y;
}
void disp()
{
System.out.println("x=" +x);
System.out.println("y=" +y);
}
}
class Point
{
public static void main(String args[])
{
Point1 pp=new Point1();
pp.init(4,3);
pp.disp();
}
}
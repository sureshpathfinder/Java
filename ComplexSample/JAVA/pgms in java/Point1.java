class Point1
{
int x,y;
Point1(int x,int y)
{
this.x=x;
this.y=y;
}
Point1()
{
this(-1,-1);
}
public static void main(String args[])
{
Point1 p=new Point1();
System.out.println("x=" +p.x+", y="+p.y);
p=new Point1(10,10);
System.out.println("x=" +p.x+", y="+p.y);
}
}

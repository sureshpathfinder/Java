class Coord
{
int x,y;
public static void main(String args[])
{
Coord p1,p2;
p1=new Coord();
p1.x=50;
p1.y=50;
p2=p1;
p1.x=100;
p1.y=75;
System.out.println("The coordinates of p1 are:" +p1.x+","+p1.y);
System.out.println("The coordinates of p2 are:" +p2.x+","+p2.y);
}
}

class Overload
{
int x,y,z;
Overload show(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
return this;
}
Overload show(int x,int y)
{
this.x=x;
this.y=y;
return this;
}
Overload show(int x)
{
this.x=x;
return this;
}
void print()
{
System.out.println("x=" +x+"\t"+"y="+y+"\t"+"z="+z);
}
public static void main(String args[])
{
Overload od=new Overload();
od.show(10,20,30);
od.print();
od.show(30,40);
od.print();
od.show(50);
od.print();
}
}



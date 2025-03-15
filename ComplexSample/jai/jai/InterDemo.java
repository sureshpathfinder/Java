interface A
{
void disp();
}
class Inter implements A,Circle
{
public void disp()
{
System.out.println("This is Multiple Inheritance");
}
public void show()
{
}
public void area(int r)
{
System.out.println("Area of circle="+pi*r*r);
}
}
class InterDemo
{
public static void main(String args[])
{
Inter i=new Inter();
i.disp();
i.area(10);
}
}
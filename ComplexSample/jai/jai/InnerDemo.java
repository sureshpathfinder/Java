class Outer
{
class Inner
{
void display()
{
System .out.println("This is inner class");
}
}
void show()
{
Inner i=new Inner();
i.display();
System.out.println("This is Outer class");
}
}
class InnerDemo
{
public static void main(String args[])
{
Outer o=new Outer();
o.show();
}
}

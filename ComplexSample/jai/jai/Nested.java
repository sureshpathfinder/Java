class Outer1
{
class Inner1
{
void dispIn()
{
System.out.println("Inner Class");
}
}
void dispOut()
{
Inner1 i=new Inner1();
i.dispIn();
System.out.println("Outer Class");
}
}
class Nested
{
public static void main(String args[])
{
Outer1 o=new Outer1();
o.dispOut();
}
}
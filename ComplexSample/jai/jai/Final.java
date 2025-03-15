final class A
{
void display()
{
System.out.println("hello");
}
}
class Final extends A
{
void display()
{
System.out.println("hi");
}
public static void main(String args[])
{
Final f=new Final();
f.display();
}
}
abstract class shape
{
int a;
abstract void display();
}
class A extends shape
{
void display()
{
System.out.println("Hello");
}
}
class Main
{
public static void main(String args[])
{
shape s;                             //object reference
A a=new A();
s=a;                                       
s.display();
}
}
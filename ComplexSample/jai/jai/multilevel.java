class A
{
void dispA()
{
System.out.println("display a");
}
}
class B extends A
{
void dispB()
{
System.out.println("display b");
}
}
class C extends A
{
void dispC()
{
System.out.println("display c");
}
}
class multilevel
{
public static void main(String args[])
{
B obj1=new B();
C obj=new C();
obj.dispA();
obj1.dispB();
obj.dispC();
obj1.dispA();
}
}	
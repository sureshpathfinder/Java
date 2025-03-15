interface A
{
 void disp();
 void disp1();
}
class B implements A
{
public void disp1()
{
System.out.println("Class B");
}
public void disp()
{
System.out.println("Class A");
}
}
class inter
{
public static void main(String args[])
{
B x2=new B();
x2.disp();
x2.disp1();
}
}
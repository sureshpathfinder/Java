class B implements Address
{
public void add(String a)
{
System.out.println("Address :"+a);
}
public void name(String n)
{
System.out.println("Name :"+n);
}
void disp()
{
System.out.println("method of class B");
}
public static void main(String args[])
{
Address b=new B();
b.disp();
b.name("aaa");
b.add("chennai");
}
}





class  Info1 extends Info
{
private int age=23;
public void disp1()
{
System.out.println("name = "+name);
System.out.println("address = "+add);
System.out.println("age = "+age);
}
public static void main(String args[])
{
Info1 i=new Info1();
i.disp1();
}
}

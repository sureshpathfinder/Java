class Stats1
{
static  int a;
int b;
Stats1()
{
a=10;
b=10;
}
static void display()
{
Stats1 s=new Stats1();
a++;
s.b++;
System.out.println("a="+a+"  b="+s.b);
}
public static void main(String args[])
{
Stats1 s=new Stats1();
Stats1 s1=new Stats1();
Stats1 s2=new Stats1();
}
}
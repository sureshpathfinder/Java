class Stats
{
static int a;
int b;
Stats()
{
a=10;
b=10;
}
static void display()
{
Stats x=new Stats();
a++;
x.b++;
System.out.println(a+"   "+x.b);
}
public static void main(String args[])
{
display();
}
}
class  Input
{
static int a=5,b=6;
Input()
{
a=10;
b=20;
}
Input(int n,int m)
{
a=n;
b=m;
}
public static void main(String args[])
{
Input s1=new Input(100,200);
Input s=new Input();
System.out.println(s.a+s.b);
System.out.print(s1.a+s1.b);
}
}
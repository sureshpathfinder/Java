class function
{

void disp()
{
System.out.println("add="+(add(10,20)));
}
int add(int a,int b)
{

return a+b;

}
public static void main(String ar[])
{
function f=new function();
f.disp();
System.out.println("addition of 2+4="+f.add(2,4));
}
}
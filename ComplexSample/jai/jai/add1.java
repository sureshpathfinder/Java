class add1
{
int a,b;
add1(int a1,int b1)
{
a=a1;
b=b1;
}
void display()
{
System.out.println("the sum="+(a+b));
}
public static void main(String args[])
{
add1 c=new add1(10,20);
c.display();
}
}
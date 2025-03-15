class outer
{
class inner
{
int mul(int a,int b)
{
int c;
c=a*b;
return(c);
}
}
inner i1=new inner();
void display()
{
System.out.println("The product of 2 nos is"+i1.mul(10,20));
}
}
class main1
{
public static void main(String a[])
{
outer o=new outer();
o.display();
}
}


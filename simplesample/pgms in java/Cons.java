class Cons
{
int i,j;
Cons(int a,int b)
{
i=a;
j=b;
}
void print()
{
System.out.println("The addition of "+i+"and"+j+"is:"+(i+j));
}
public static void main(String args[])
{
Cons c=new Cons(10,10);
c.print();
System.out.println(" ");
Cons c1=new Cons(50,50);
c1.print();
}
}

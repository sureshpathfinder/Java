class arith
{
public static void main(String ar[])throws ArithmeticException
int a,b,c;
a=5;
b=0;
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
c=a+b;
System.out.println("sum="+c);
}
}
}

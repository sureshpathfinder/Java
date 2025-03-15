class Arith1
{
public static void main(String[] a1)
{
int a=5,b=3,c=1;
try
{
System.out.print("calc="+(a/(b-c)));
}
catch(ArithmeticException e)
{
System.out.print("b and c should not be equal"+e);
}
}
}
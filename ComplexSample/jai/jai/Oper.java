
class Oper
{
public static void main(String args[])throws ArithmeticException
{
int a=10,b=5,c=5;
try
{
int d=a/(b-c);
System.out.print(d);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
int d=a/(b+c);
System.out.println("d="+d);
}
}
}
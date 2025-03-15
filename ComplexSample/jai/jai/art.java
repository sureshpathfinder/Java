import java.lang.*;
class art
{
public static void main(String args[])throws ArithmeticException
{
int a,b=5,c=0;
try
{
a=b/c;
System.out.println(a);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
a=b+c;
System.out.println(a);
}
}
}
class fin{
public static void main(String args[]) 
{
try
{ 
int a=0;
int b=10/a;
System.out.println("this line will not be printed");
}
catch(ArithmeticException e)
{
 System.out.println("Division by zero");
}
finally
{
System.out.println("I love india");
 }
}
}
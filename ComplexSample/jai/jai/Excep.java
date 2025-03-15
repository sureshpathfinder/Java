public class Excep
{
public static void main(String z[])
{
int a;
try
{
a=Integer.parseInt(z[0]);
System.out.print(a);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("check the array value");
}
}
}
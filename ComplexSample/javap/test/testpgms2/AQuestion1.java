public class AQuestion1
{
private int i = giveMeJ();
private int j = 10;
private int giveMeJ()
{
return j;
}
public static void main(String args[])
{
AQuestion1 a= new AQuestion1();
System.out.println(a.j);
System.out.println("Before Try");
try
{
}
catch(Throwable t)
{
System.out.println("Inside Catch");
}
System.out.println("At the End");
}
}

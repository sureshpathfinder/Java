import pack.*;
import sha.Reverse;
class sample
{
public static void main(String args[])
{
System.out.println("Welcome to java");
Fact f=new Fact();
System.out.println("Factorial of 5="+f.factorial(5));
System.out.println("The fibonacci series for 15 terms:");
Fibo.fibonacci(15);
String s="tamil";
Reverse r=new Reverse();
s=r.invert(s);
System.out.println(s);
}
}

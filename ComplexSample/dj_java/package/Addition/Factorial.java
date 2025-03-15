package Arithmetic;
public class Factorial
{
public void fact(int a)
{
int f=1;
for(int i=1;i<=a;i++)
{
f=f*i;
}
System.out.println("Result for Factorial of "+a+" = "+f);
}
}


//package = javac -d . filename.java
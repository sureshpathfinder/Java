package pack;
public class Fibo
{
public static void fibonacci(int n)
{
for(int i=0;i<n;i++)
System.out.println(fib(i));
}
static int fib(int a)
{
if(a==0)
return 0;
else if(a==1)
return 1;
else
return(fib(a-1)+fib(a-2));
}
}
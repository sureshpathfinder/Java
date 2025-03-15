import java.io.*;
import java.lang.*;
class except
{
public static void main(String args[])
{
System.out.println("\n Exception Handling ");
System.out.println("\n---------------------------\n");
try
{
int x[]=new int[5];
x[10]=100;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("\n Array Index Out of Bounds "+e);
}
try
{
int a=100,b=0;
int c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("\n Divide By Zero Error "+e);
}
System.out.println("\n Existing the Main Method After Executing the Exceptions. \n");
}
}


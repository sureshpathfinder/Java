import java.util.*;
class Exception
{
public static void main(String args[])
{
int a,b;
String c[]=new String[5];
Scanner s=new Scanner(System.in);
try
{
a=Integer.parseInt(args[0]);
 b=Integer.parseInt(args[1]);
for(int i=0;i<6;i++)
c[i]=args[i+2];
System.out.println(a/b);
} 
catch(ArithmeticException e)
{
System.out.println("Please enter nonzero number for b");
}
catch(NumberFormatException e)
{
System.out.println("Enter numbers for the variables");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Enter the correct number of values");
}
System.out.println("ProgramEnds");
}
}
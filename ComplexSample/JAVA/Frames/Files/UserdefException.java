import java.io.*;
class MyException extends Exception
{
private int a;
MyException(int b)
{
a=b;
}
public String toString()
{
return "MyException ["+a+ "]";
}
}
class UserdefException
{
public int x;
final int k=5;
void getInt()
{
try
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Do some guess work to generate your own exception");
System.out.println("Enter ano b/t 1 and 10");
System.out.println("Between these nos lies the number to generate ur own exception");
String line;
while((line=b.readLine())!=null)
{
x=Integer.parseInt(line);
if(x==5)
{
System.out.println("congrats! u have generated an exception");
throw new MyException(x);
}
else
System.out.println("wrong guess!! try again");
continue;
}
}
catch(MyException m)
{
System.out.println("Generated exception:"+m);
}
catch(NumberFormatException n)
{
System.out.println("sorry !! no characters");
System.out.println("Exiting........");
System.out.println("Generated Exception:"+n);
}
catch(IOException e)
{
}
}
public static void main(String args[])
{
UserdefException u=new UserdefException();
u.getInt();
}
}

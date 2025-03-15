import java.util.Scanner;
class Throw
{
public static void main(String args[])throws Exception
{
int age;
Scanner s=new Scanner(System.in);
Exception e=new Exception();
try
{
age=s.nextInt();
if((age<18)||(age>50))
throw e;
else
System.out.println("you have qualified");
}
catch(Exception e)
{
System.out.println("Age should be in between 18 to 50");
}
}
}

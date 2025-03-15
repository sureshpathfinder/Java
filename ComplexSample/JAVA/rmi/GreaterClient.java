import java.io.*;
import java.rmi.*;
public class GreaterClient
{
public static void main(String args[])
{
String result;
int n=0,n1=0;
try
{
Greater f=(Greater)Naming.lookup("GreaterServer");
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter two numbers");
n=Integer.parseInt(br.readLine());
n1=Integer.parseInt(br.readLine());
}
catch(IOException e)
{
}
result=f.getResult(n,n1);
if(result.equals("Equal"))
System.out.println("Numbers are equal");
else
System.out.println("The greater number is:"+result);
}
catch(Exception e)
{
System.out.println("Exception from client :"+e);
}
}
}

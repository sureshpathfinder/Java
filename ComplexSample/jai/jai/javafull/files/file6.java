import java.io.*;
public class file6
{
public static void main(String args[]) throws Exception
{
char  c;
BufferedReader bp=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter The Characters");
do
{
c=(char)bp.read();//read Characters
}while(c!=null);
String s=bp.readLine();
System.out.println(s);
}
}




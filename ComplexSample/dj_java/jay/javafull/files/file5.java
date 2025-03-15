import java.io.*;
public class file5
{
public static void main(String args[]) throws Exception
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Employee No : ");
int no=Integer.parseInt(in.readLine());
System.out.println("Enter Employee Name : ");
String nm=in.readLine();
System.out.println("Enter Basic Pay");
float sal=Float.parseFloat(in.readLine());
System.out.println("--------------------------------------------------");
System.out.println("Employee No      : "+no);
System.out.println("Employee Name : "+nm);
System.out.println("Basic Pay            : "+sal);
System.out.println("--------------------------------------------------");
}
}


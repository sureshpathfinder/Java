import java.io.*;
class bupdate
{
public static void main(String args[])throws IOException
{
int a;  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter values");
String s=br.readLine();
a=Integer.parseInt(s);
System.out.println("a="+a);
} 
}


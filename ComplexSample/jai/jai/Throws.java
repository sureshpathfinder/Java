import java.io.*;
class Throws
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
int a=Integer.parseInt(s);
System.out.print(a);
}
}
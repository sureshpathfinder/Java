import java.io.*;
class ioexcept
{
public static void main(String ar[])throws IOException
{
BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(s.readLine());


System.out.println("hello a="+a);
}
}
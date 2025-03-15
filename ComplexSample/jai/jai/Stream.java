import java.io.*;
class Stream
{
public static void main(String args[])throws IOException
{
DataInputStream d=new DataInputStream(System.in);
int a=Integer.parseInt(d.readLine());
System.out.println(a+12);
}
}

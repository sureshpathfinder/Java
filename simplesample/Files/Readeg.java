import java.io.*;
class ReadEg
{
public static void main(String args[]) throws IOException
{
int i;
byte[] c=new byte[10];
System.out.println("Enter a string of 10 characters");
for(i=0;i<10;i++)
c[i]=(byte)System.in.read();
System.out.println("The string entered is:");
for(i=0;i<10;i++)
System.out.println((char)c[i]);
}
}

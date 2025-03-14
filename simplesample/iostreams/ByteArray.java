import java.io.*;
class ByteArray
{
public static void main(String args[]) throws Exception
{
ByteArrayOutputStream f=new  ByteArrayOutputStream(15);
System.out.println("enter 10 characters and press enter key");
while(f.size() !=10)
{
f.write(System.in.read());
}
System.out.println("Accepted characters in to an array");
byte b[ ]=f.toByteArray();
System.out.println("Displaying char in array");
int l;
System.out.println(b.length);
for( l=1;l<b.length;l++);
{
System.out.println((char) b[l]);
}
ByteArrayInputStream inp=new ByteArrayInputStream(b);
int c;
System.out.println("converted to uppercase char");
for(int i=0;i<l;i++)
{
while((c=inp.read())!=-1)
{
System.out.println(Character.toUpperCase((char)c));
}
System.out.println();
inp.reset();
}
}
}


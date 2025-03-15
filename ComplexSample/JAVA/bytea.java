import java.io.*;
class bytea
{
public static void main(String args[]) throws IOException
{
ByteArrayOutputStream f=new ByteArrayOutputStream(12);
while(f.size() !=10)
{
f.write(System.in.read());
}
byte b[]=f.toByteArray();
ByteArrayInputStream fi=new ByteArrayInputStream(b);
for(int i=0;i<10;i++)
{
System.out.print((char)b[i]);
}
int c;
System.out.println();
while((c=fi.read())!=-1)
{
System.out.print(Character.toUpperCase((char)c));
}
}
}

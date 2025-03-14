import java.io.*;
class ReadWriteFile
{
public static byte getInput()[ ] throws Exception
{
byte inp[]=new byte[50];
System.out.println("enter text");
for(int i=0;i<50;i++)
{
inp[i]=(byte) System.in.read();
}
return inp;
}
public static void main(String args[]) throws Exception
{
byte input[]=getInput();
OutputStream f=new FileOutputStream("c:/java/write.txt");
for(int i=0;i<50;i++)
{
f.write(input[i]);
}
f.close();
int size;
InputStream f1=new FileInputStream("c:/java/write.txt");
size=f1.available();
System.out.println("Reading contents of file write.txt");
for(int i=0;i<size;i++)
{
System.out.println((char)f1.read());
}
f.close();
}
}


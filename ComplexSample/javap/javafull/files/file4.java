import java.io.*;
public class file4
{
public static void main(String args[]) throws Exception
{
String s="This is the Sample Text File for FILE OUTPUTSTREAM";
byte b[]=s.getBytes();
FileOutputStream f=new FileOutputStream("example.txt");
for(int i=0;i<b.length;i+=2)
 {
f.write(b[i]);
}
//f.write(b);
f.close();
}
}

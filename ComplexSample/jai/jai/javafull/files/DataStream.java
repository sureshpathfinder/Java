import java.io.*;
class DataStream
{
public static void main(String args[])throws IOException
{
BufferedReader d=new BufferedReader(new InputStreamReader(new FileInputStream("C:/Yuvaraj/a.txt")));
DataOutputStream o=new DataOutputStream(new FileOutputStream("C:/yuvaraj/a1.txt"));
String line;
while((line=d.readLine())!=null)
{
String a=(line.toUpperCase());
System.out.println(a);
o.writeBytes(a+"\n");
}
d.close();
o.close();
}
}

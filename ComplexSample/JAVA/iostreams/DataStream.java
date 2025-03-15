import java.io.*;
class DataStream
{
public static void main(String args[]) throws IOException
{
BufferedReader d=new BufferedReader(new InputStreamReader(new FileInputStream("c:/java/temp.txt")));
DataOutputStream o=new DataOutputStream(new FileOutputStream("c:/java/temp1.txt"));
String line;
while((line=d.readLine())!=null)
{
String a=(line.toUpperCase());
System.out.println(a);
o.writeBytes(a +"\r\n");
}
d.close();
o.close();
}
}

import java.io.*;
public class file8
{
public static void main(String args[]) throws Exception
{
FileOutputStream f=new FileOutputStream("sample.txt");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;

while((s=br.readLine())!=null)
{
f.write(s.getBytes());
}
}
}


import java.io.*;
public class file7
{
public static void main(String args[]) throws Exception
{
FileReader fr=new FileReader("file1.java");
BufferedReader br=new BufferedReader(fr);
String s;
while((s=br.readLine())!=null)
{
System.out.println(s);
}
fr.close();
}
}

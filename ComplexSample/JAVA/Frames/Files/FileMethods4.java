import java.io.*;
public class FileMethods4 implements FilenameFilter
{
String w;
public FileMethods4(String w)
{
this.w="."+w;
}
public boolean accept(File dir,String name)
{
return name.endsWith(w);
}
public static void main(String args[]) throws IOException
{
for(int p=0;p<args.length;p++)
{
File f1=new File("c:/");
FilenameFilter only=new FileMethods4(args[p]);
String s[]=f1.list(only);
System.out.println("printing files with"+args[p]+"extension in the "+f1.getPath()+"directory");
for(int i=0;i<s.length;i++)
System.out.println(s[i]);
}
}
}

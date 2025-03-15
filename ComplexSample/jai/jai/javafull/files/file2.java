import java.io.*;
public class file2
{
public static void main(String args[])
{
String dir="c:/";
File f2=new File(dir);
String s[]=f2.list();
int i;
for(i=0;i<s.length;i++)
	{
	System.out.println(s[i]);
	}

for(i=0;i<s.length;i++)
{
File  f=new File(dir+"/"+s[i]);
if(f.isDirectory())
System.out.println(s[i]+" is Directory");
else
System.out.println(s[i]+" is File");
}
}
}





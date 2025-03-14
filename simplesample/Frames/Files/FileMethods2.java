import java.io.*;
class FileMethods2
{
public static void main(String args[])
{
File f1=new File("c:\\java","test.txt");
if(f1.canRead())
System.out.println("we can read from this file");
else
System.out.println("we cannot read from this file");
if(f1.canWrite())
System.out.println("we can write to this file");
else
System.out.println("we cannot write to this file");
System.out.println("The file was last modified at"+f1.lastModified()+"seconds after august 8 2005");
}
}

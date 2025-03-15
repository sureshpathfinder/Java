import java.io.*;
class File2
{
public static void main(String args[])
{
File f=new File("d:\\sss","abc.docx");
System.out.println("The file name="+f.getName());
System.out.println("Path="+f.getPath());
System.out.println("Absolute path="+f.getAbsolutePath());
System.out.println(f.isDirectory());
System.out.println(f.isFile());
System.out.println(f.exists());
System.out.println(f.getParent());
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println(f.lastModified());
System.out.println(f.length());
}
}
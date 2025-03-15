import java.io.*;
public class file1
{
static void print(String s)
{
System.out.println(s);
}
public static void main(String args[])
{

File f1=new File("c:/windows/bubbles.bmp");
print("File name ="+f1.getName());
print("Path      ="+f1.getPath());
print("Absolute  ="+f1.getAbsolutePath());
print("Parent name ="+f1.getParent());
print("File Exists ="+(f1.exists()?"True":"False"));
print("Can Read ="+(f1.canRead()?"True":"False"));
print("Can Write ="+(f1.canWrite()?"True":"False"));
print("Is File   ="+(f1.isFile()?"True":"False"));
print("Is Directory ="+(f1.isDirectory()?"True":"False"));
print("Last Modified ="+f1.lastModified());
print("Length of the File "+f1.length());
}
}


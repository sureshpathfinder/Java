import java.io.*;
class File1
{
public static void main(String args[])
{
File f=new File("d:\\sss\\jjj");
File f1=new File("d:\\sss\\xxx");
f.renameTo(f1);
f.delete();
}
}
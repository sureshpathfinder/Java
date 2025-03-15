import java.io.*;
class FileMethods5
{
public static void main(String args[])throws IOException
{
File f=new File("c:/java/temp");
if(f.mkdir())
System.out.println("created a directory");
else
System.out.println("unable to create a directory");
}
}
 
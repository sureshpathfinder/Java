import java.io.*;
class File_Methods
{
  public static void main(String args[])
  {
    File f=new File("hello.txt");
    //File f1=new File("e://d/hello1.txt");
    System.out.println("File name="+f.getName());
    System.out.println("File path="+f.getAbsolutePath());
    System.out.println("File exist="+(f.exists()?"yes":"no"));
    System.out.println("File/Directory="+(f.isDirectory()?"Directory":"File"));
    System.out.println("Can Write a File = "+(f.canWrite()?"Yes":"No"));
    System.out.println("Last Modify of the File = "+f.lastModified()+" Seconds");
    System.out.println("File size in Bytes = "+f.length());
   }
}
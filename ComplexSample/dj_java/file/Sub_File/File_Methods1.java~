import java.io.*;
class File_Methods1
{
  public static void main(String args[])
  {
    File f=new File("hello123.txt");
    File f1=new File("HELLO123.txt");
    File f2=new File("delete.txt");
    System.out.println("Renamed a file ? = "+(f.renameTo(f1)?"yes":"no"));
    boolean s=f2.exists();
    if(s==true)
    {
      System.out.println((f2.delete()?"Ok":"Not")+" File deleted successfully");
    }
    else
    {
      System.out.println("File Not Exist");
    }
  }
}
    
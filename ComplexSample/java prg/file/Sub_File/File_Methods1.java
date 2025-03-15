import java.io.*;
class File_Methods1
{
  public static void main(String args[])
  {
    File f=new File("sam_file.txt");
    File f1=new File("eg.txt");
    File f2=new File("sample.txt");
    System.out.println("Renamed a file ? = "+(f.renameTo(f1)?"yes":"no"));
    boolean s=f2.exists();
    if(s==true)
    {
      System.out.println((f2.delete()?"Ok":"Not")+" File action done successfully");
    }
    else
    {
      System.out.println("File Not Exist");
    }
  }
}
    
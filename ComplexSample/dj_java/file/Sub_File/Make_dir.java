import java.io.*;
class Make_dir
{
  public static void main(String args[])
  {
    File f=new File("e:/sun/");
    System.out.println("Directory Created ..? "+(f.mkdir()?"Yes":"No"));
  }
}
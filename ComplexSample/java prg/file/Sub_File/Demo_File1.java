import java.io.*;
class Demo_File1
{
public static void main(String args[])
 {
   String fname = "E:\\demofile";
   File f = new File(fname);
   System.out.println( fname +" file size: "+f.isDirectory());
 }
}

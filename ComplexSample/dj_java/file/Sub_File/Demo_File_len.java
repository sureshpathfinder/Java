import java.io.*;
class Demo_File_len
{
public static void main(String args[])
 {
   String fname = "class10.txt";
   File f = new File(fname);
   System.out.println( fname +" file size: "+f.length());
 }
}

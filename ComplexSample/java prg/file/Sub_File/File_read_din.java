import java.io.*;
class File_read_din 
{
   public static void main(String args[])
  {
      try
      {
       FileInputStream fin = new FileInputStream("sam_file.txt");
       DataInputStream in = new DataInputStream(fin);
       BufferedReader br = new BufferedReader(new InputStreamReader(in));
       String st;
        while ((st = br.readLine()) != null) 
        {
           System.out.println(st);
         }
       in.close();
      }
      catch (Exception e)
      {
        System.err.println("Error: " + e);
       }
  }
}
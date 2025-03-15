import java.io.*;

public class File_DOS
{
  public static void main(String[] args) throws Exception 
  {
    try 
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      FileOutputStream fos = new FileOutputStream("sam_file.txt",true);
      DataOutputStream dos = new DataOutputStream(fos);
      dos.writeChars(br.readLine());
      dos.close();
    } 
    catch (Exception e) 
    {
      System.out.println(e);
    }
  }
}
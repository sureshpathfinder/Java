import java.io.*;
class File_write_din
{
    public static void main(String[] args) throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the file name to create : ");
    String fname = br.readLine();
    File f1 = new File(fname);//creating a new file 
    

    boolean ex = f1.createNewFile();
    if (!ex)
    {
      System.out.println("File already exists.");
     }
    else
    {
      FileWriter fwrite = new FileWriter(fname);
      BufferedWriter out = new BufferedWriter(fwrite);
      out.write(br.readLine());
      out.newLine();
      out.close();
      System.out.println("File created successfully.");
    }
  }
}
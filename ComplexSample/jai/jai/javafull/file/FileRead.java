import java.io.*;
class FileRead 
{
   public static void main(String args[])
  {
      try{
    FileInputStream fstream = new FileInputStream("out.txt");
    //DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    String strLine;
    while ((strLine = br.readLine()) != null)   {
      System.out.println (strLine);
    }
    //in.close();
    }catch (Exception e){
      System.err.println("Error: " + e.getMessage());
    }
  }
}


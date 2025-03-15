import java.io.*;
class FileRead 
{
   public static void main(String args[])
  {
      try{
        int i=0;
    FileInputStream f = new FileInputStream("myfile.txt");
    //DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(f));
    String strLine;
    while ((strLine = br.readLine()) != null)   {
     
        i++;
      
      System.out.println (strLine);
    }
    System.out.println ("Line="+i);
    //in.close();
    }catch (Exception e){
      System.err.println("Error: " + e.getMessage());
    }
  }
}


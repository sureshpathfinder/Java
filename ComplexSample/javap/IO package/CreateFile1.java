import java.io.*;

public class CreateFile1{
    public static void main(String[] args) throws IOException{
      File r;
      r=new File("myfile.txt");
      if(!r.exists()){
      r.createNewFile();
      System.out.println("New file \"myfile.txt\" has been created to the current directory");
      }
    }
} 

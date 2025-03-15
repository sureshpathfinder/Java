import java.io.*;

public class PathFile
{
    public static void main(String[] args) throws IOException{
      File f=new File("hai.txt");
      System.out.println("The absolute path of the file is: "+f.getAbsolutePath());      
    }
} 

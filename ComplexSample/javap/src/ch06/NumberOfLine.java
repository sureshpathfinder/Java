import java.io.*;
  public class NumberOfLine{

  public static void main(String[] args) {
  
    try{

      System.out.println("Getting line number of a paritcular file example!");
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Please enter file name with extension:");
      
      String str = bf.readLine();
  
      File file = new File(str);

      if (file.exists()){

        FileReader fr = new FileReader(file);
   
     LineNumberReader ln = new LineNumberReader(fr);
  
      int count = 0;
  
        while (ln.readLine() != null){
  
          count++;
     
   }
 
       System.out.println("Total line no: " + count);
  
        ln.close();
  
      }
  
      else{
 
       System.out.println("File does not exists!");
 
     }
  
    }

    catch(IOException e){

      e.printStackTrace();

    }

  }

} 

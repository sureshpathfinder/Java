import java.io.*;

class Test{
public static void main(String args[])throws IOException {
FileInputStream fis=null;
try{
fis = new FileInputStream (new File (args[0]));
}
catch (FileNotFoundException e){
System.out.println("File not found!");
}
finally{
fis.close();
}
}
}

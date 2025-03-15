import java.io.*;

class Test1{
public static void main(String args[]){
FileInputStream fis=null;
try {
fis = new FileInputStream (new File (args[0]));
int ch;
while ((ch = fis.read()) != -1){
System.out.print ((char) ch);
}
}
catch (FileNotFoundException e){
System.out.println("File not found!");
}
catch (IOException e){
System.out.println("Unable to read file!");
}
finally{
System.out.println();
System.out.println("In finally.");
try{
if(fis!=null){
fis.close();
}
}
catch (IOException ioe){
System.out.println("In finally.");
}
}
}
}
import java.io.*;

class Test3{
public static void main(String args[]) throws FileNotFoundException,IOException {
FileInputStream fis=null;
fis = new FileInputStream (new File (args[0]));
int ch;
while ((ch = fis.read()) != -1){
System.out.print ((char) ch);
}
fis.close();
}
}
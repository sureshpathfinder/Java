import java.io.*;
public class MyWordCounter
{
public static void main(String args[])throws IOException,FileNotFoundException
{
FileReader fr=new FileReader("C:\\months.txt");
StreamTokenizer input=new StreamTokenizer(fr);
int tok;
int count=0;

while((tok=input.nextToken())!=StreamTokenizer.TT_EOF)
if(tok==StreamTokenizer.TT_WORD)
{
System.out.println("Word Found  :"+input.sval);
count++;
}
System.out.println("Found "+count+"  Words in A.txt");
}
}



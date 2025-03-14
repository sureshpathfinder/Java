import java.io.*;
public class WordCounter
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader("c:/java/read.txt");
StreamTokenizer input=new StreamTokenizer(fr);
int tok;
int count=0;
while((tok=input.nextToken())!=StreamTokenizer.TT_EOF)
if(tok==StreamTokenizer.TT_WORD)
{
System.out.println("word found :"+input.sval);
count++;
}
System.out.println("Found"+count+"words in read.txt");
}
}
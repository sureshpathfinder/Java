import java.io.*;
class Books extends Publish
{
protected String aut;
protected String name;
void getDet()
{
super.getDet();
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter author name");
aut=br.readLine();
System.out.println("enter book name");
name=br.readLine();
}
catch(IOException e)
{
}
}
void showDet()
{
super.showDet();
System.out.println("showing book details");
System.out.println("author name"+aut);
System.out.println("book name" +name);
}
}

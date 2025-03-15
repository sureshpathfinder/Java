import java.io.*;
class Publish
{
protected String pubid;
protected String pname;
void getDet()
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter data");
System.out.println("enter publisher id");
pubid=br.readLine();
System.out.println("enter publisher name");
pname=br.readLine();
}
catch(IOException e)
{
}
}
void showDet()
{
System.out.println("showing publisher details");
System.out.println("publisher id"+pubid);
System.out.println("publisher name"+pname);
}
}


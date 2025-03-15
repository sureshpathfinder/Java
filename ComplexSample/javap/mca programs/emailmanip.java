import java.io.*;
import java.util.*;
class emailmanip
{
public static void main(String args[])throws IOException
{
System.out.println("\t\tE-MAIL ADDRESS STORING AND ITS MANIPULATION");
System.out.println("----------------------------------------------------");
Properties prop=new Properties();
DataInputStream ds=new DataInputStream(System.in);
String name,mail_id;
FileInputStream fin=null;
boolean changed =false;
try
{
fin=new FileInputStream("phonebook.dat");
}
catch(FileNotFoundException e)
{
}
try
{
if(fin!=null)
{
prop.load(fin);
fin.close();
}
}
catch(IOException e)
{
System.out.println("Error in Reading File");
}
do
{
System.out.println("Enter name :"+"(Type \"Quit\"to Stop)");
name=ds.readLine();
if(name.equals("quit"))
{
break;
}
System.out.println("Enter Email Id: ");
mail_id=ds.readLine();
prop.put(name,mail_id);
changed=true;
}while(!name.equals("quit"));
if(changed)
{
FileOutputStream fout= new FileOutputStream("phonebook.dat");
prop.store(fout,"Address Book");
fout.close();
}
do
{
System.out.println("Enter the name to find:"+"(Type\"Quit\"toStop)");
name=ds.readLine();
if(name.equals("quit"))
{
break;
}
mail_id=(String)prop.get(name);
System.out.println(mail_id);
}while(!name.equals("quit"));
}
}
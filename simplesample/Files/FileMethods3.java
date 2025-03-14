import java.io.*;
class FileMethods3
{
public static void main(String args[ ])
{
int i;
System.out.println(args[0]);
for( i=0;i<args.length;i++);
{
File f=new File("C:\\java",args[i]);
File f1=new File("C:\\java\\renfile");
if(f.exists())
{
System.out.println(f+"exists");
System.out.println("Its size is "+f.length()+"bytes");
f.renameTo(f1);
System.out.println("Renamed file name : "+f1);
System.out.println("deleting the file"+f);
System.out.println("=============================");
f.delete();
}
else
System.out.println(f+"does not exist");
}
}
}

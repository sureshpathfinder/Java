import java.io.*;
public class file3
{
public static void main(String args[]) throws Exception
{
int size;
//Read the data's from file
FileInputStream f=new FileInputStream("c:\\kar.txt");
size=f.available();
System.out.println("Total Bytes "+size);
for(int i=0;i<size;i++)
	{
//	System.out.println("Now  "+f.available());
	System.out.print((char)f.read());
	}
	System.out.println("Now  "+f.available());
}
}

	

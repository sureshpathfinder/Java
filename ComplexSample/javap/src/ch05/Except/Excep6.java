/* EXCEPTIONS - THROWING AN EXCEPTION
*/
import java.io.*;
public class Excep6
{
	void myMethod()
	{
		try
		{
			doRead();
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}
	void doRead() throws IOException
	{
		//byte[] buffer=new byte[255];
		int in=System.in.read();
	}
public static void main(String[] a) 
{
	Excep6 ex=new Excep6();
	ex.myMethod();
}
}
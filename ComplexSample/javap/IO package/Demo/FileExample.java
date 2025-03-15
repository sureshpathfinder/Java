import java.io.*;

class FileExample 
{
	public static void main(String[] args) 
	{
		try{
		File f=new File("Hi.txt");
//		File f1=new File("Hi","hello.txt");
		System.out.println(f.getName());
		System.out.println(f.exists());
		if(f.createNewFile())
		{
			System.out.println(f.getName());
			System.out.println(f.exists());
		}
		}
		catch(Exception e){System.out.println(e);}
	}
}

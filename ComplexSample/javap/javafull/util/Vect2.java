import java.util.*;
class Vect2
{
	public static void main(String args[])
	{
		Vector list=new Vector();
		int length=args.length;
		for(int i=0;i<length;i++)
		{
			list.addElement(args[i]);
		}

                                      System.out.println(list);
		
                                       int size=list.size();
		String listArray[]=new String[size];
		list.copyInto(listArray);
		System.out.println("List of Languages");
		for(int i=0;i<size;i++)
		{
			System.out.println(listArray[i]);
		}
	}
}
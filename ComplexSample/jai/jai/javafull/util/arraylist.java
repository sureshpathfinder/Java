import java.util.*;

class arraylist
{
	public static void main(String args[])
	{
		ArrayList arr=new ArrayList();
		arr.add(new Integer(1));
		arr.add(new Double(45.67));
		arr.add("welcome");
		ArrayList arr1=new ArrayList();
		//arraylist accepts duplicate values-->i.e.,hello
		arr1.add(new Integer(2));
		arr1.add("hello");
		arr1.add("hello");
		arr.addAll(arr1);
		Iterator i=arr.iterator();
		while(i.hasNext())
		{
			System.out.println(arr.indexOf(i.next()));
		}
	   	System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
	//Replaces all the elements present in the arr with example
		Collections.fill(arr,"example");
		System.out.println(arr);
	}
}
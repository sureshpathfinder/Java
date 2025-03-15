//TreeSet doesn't accept duplicate values and is an sorted order

import java.util.*;

class treeset
{
	public static void main(String args[])
	{
		TreeSet hs=new TreeSet();
		hs.add("2");
		hs.add("1");
		hs.add("1");
		//hs.remove("1");
		System.out.println(hs);
	}
}
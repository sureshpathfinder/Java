//hashset doesn't accept duplicate values and is unsorted order

import java.util.*;

class hashset
{
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add("2");
		hs.add("1");
		hs.add("1");
		System.out.println(hs);
	}
}
//TreeSet doesn't accept duplicate values and is an sorted order

import java.util.*;

class treeset1
{
	public static void main(String args[])
	{
		TreeSet hs=new TreeSet();
		hs.add("kamal");
		hs.add("narayan");
		hs.add("logu");
		hs.add("kamal");
                                      hs.add("ajai");
		System.out.println(hs);
	}
}
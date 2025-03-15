//hashset doesn't accept duplicate values and is unsorted order

import java.util.*;

class hashset1
{
	public static void main(String args[])
	{
		//HashSet hs=new HashSet();
		LinkedHashSet hs = new LinkedHashSet ();
                                       hs.add("SSI");
		hs.add("kamal");
		hs.add("umapathy");
		hs.add("ajai");
                                     Iterator it = hs.iterator();
                                      while(it.hasNext())
                                     {

                                             System.out.println(it.next());
                                             }
                                    
		System.out.println(hs);
	}
}
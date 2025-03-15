//TreeMap doesn't accept duplicate values in Key and
// is an sorted order for the Key(here cc is the duplicate Key)

import java.util.*;

class treemap
{
	public static void main(String args[])
	{
		TreeMap hs=new TreeMap();
		hs.put("aa",new Integer(1));
		hs.put("cc",new Integer(2));
		hs.put("dd",new Integer(3));
		hs.put("cc",new Integer(4));
		hs.put("bb",new Integer(5));
		Set s=hs.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
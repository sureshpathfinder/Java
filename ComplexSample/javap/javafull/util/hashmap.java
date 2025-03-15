//Hashmap will sort the Key and will not accept 
//the duplicate in the Key values (cc) in this case

import java.util.*;

class hashmap
{
	public static void main(String args[])
	{
		HashMap hs=new HashMap();
		hs.put("aa",new Integer(1));
		hs.put("cc",new Integer(2));
		hs.put("dd",new Integer(3));
		hs.put("cc",new Integer(4));
		hs.put("bb",new Integer(5));				
                  
                 system.out.println(hs);
		Set s=hs.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
//Hashmap will sort the Key and will not accept 
//the duplicate in the Key values (cc) in this case

import java.util.*;

class hashmap1
{
	public static void main(String args[])
	{
		HashMap hs=new HashMap();
		hs.put("narayan",new Integer(1));
		hs.put("kamal",new Integer(2));
		hs.put("logu",new Integer(3));
		hs.put("ssi",new Integer(4));
		hs.put("kamal",new Integer(5));				
                                
                                      System.out.println(hs.get(ssi));  
                                   /*Iterator i=hs.iterator();
		while(i.hasNext())
		{
	
                                                              System.out.println(i.getValue());
                                       	} */
                   
                   
	

                    	/*Set s=hs.entrySet();
		System.out.println("value of s is " + s);
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
		} */
	}
}
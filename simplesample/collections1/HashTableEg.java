import java.util.*;
class HashTableEg
{
public static void main(String args[])
{
Hashtable h=new Hashtable();
h.put("Vasanth",new Integer(90));
h.put("Arjun",new Integer(50));
h.put("Suresh",new Integer(78));
h.put("Ajay",new Integer(80));
h.put("Ravi",new Integer(67));
Enumeration e=h.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}

import java.util.*;
class HashMapOper
{
public static void main(String args[])
{
HashMap h=new HashMap();
h.put("Vasanth",new Integer(90));
h.put("Arjun",new Integer(50));
h.put("Suresh",new Integer(78));
h.put("Ajay",new Integer(80));
h.put("Ravi",new Integer(67));
h.put("Arjun",new Integer(50));
Set s=h.entrySet();
Iterator i=s.iterator();
System.out.println("The following are marks scored by students");
System.out.println("Names\t\tMarks\n");
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
System.out.println(e.getKey()+"\t\t"+e.getValue());
}
h.put("Ravi",new Integer(70));
i=s.iterator();
System.out.println("The hash map after the change is:\n");
System.out.println("Names\t\tMarks\n");
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
System.out.println(e.getKey()+"\t\t"+e.getValue());
}
}
}

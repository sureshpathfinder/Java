import java.util.*;
class TreeMapOper
{
public static void main(String args[])
{
TreeMap t=new TreeMap();
t.put("Vasanth",new Integer(90));
t.put("Arjun",new Integer(50));
t.put("Suresh",new Integer(78));
t.put("Ajay",new Integer(80));
t.put("Ravi",new Integer(67));
t.put("Arjun",new Integer(50));
Set s=t.entrySet();
Iterator i=s.iterator();
System.out.println("The following are marks scored by students");
System.out.println("Names\t\tMarks\n");
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
System.out.println(e.getKey()+"\t\t"+e.getValue());
}
if(t.containsKey("Ravi"))
System.out.println("The map contains a mapping for entry ravi");
else
System.out.println("The map does not contain any mapping for entry ravi");
t.put("Ajay",new Integer(100));
i=s.iterator();
System.out.println("The tree map after the change is:\n");
System.out.println("Names\t\tMarks\n");
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
System.out.println(e.getKey()+"\t\t"+e.getValue());
}
}
}


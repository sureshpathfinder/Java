import java.util.*;

class hashmap
{
 public static void main(String args[])
 {
  HashMap hs=new HashMap();               // KEY ARE UNIQUE, BUT VALUE MAY HAVE DUPLICATE
  hs.put("aa",new Integer(1));
  hs.put("cc",new Integer(2));
  hs.put("dd",new Integer(1));
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
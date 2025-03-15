import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet
{
    public static void main(String[] args) 
    {
        Set<String> s=new TreeSet<String>();
        s.add("b");
        s.add("a");
        s.add("d");
        s.add("c");

        Iterator it=s.iterator();
        while(it.hasNext())
        {
          String value=(String)it.next();
          System.out.println("Value :"+value);
        }
    }
}

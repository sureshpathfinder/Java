import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet1
{
    public static void main(String[] args) 
    {
        TreeSet s=new TreeSet();
        s.add("b");
        s.add("a");
        s.add("d");            // DUPLICATE VALUES CANNOT BE ACCEPTED
        s.add("c");
        s.add("a");

        Iterator it=s.iterator();
        while(it.hasNext())
        {
          String value=(String)it.next();
          System.out.println("Value :"+value);
        }
    }
}

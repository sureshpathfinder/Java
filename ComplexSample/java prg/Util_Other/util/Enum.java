import java.util.Vector;
import java.util.Enumeration;
public class Enum
{
  public static void main(String args[])
  {
    Enumeration names;
    Vector vect = new Vector();
    vect.add("Karthik");
    vect.add("Kameshwari");
    vect.add("Naga Raj");
    vect.add("Dinesh");
    System.out.println(vect);
    names = vect.elements();
    while (names.hasMoreElements())
       System.out.println(names.nextElement());
  }
}
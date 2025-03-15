import java.util.Vector;


public class Vector_cls
{
  public static void main(String[] args)
  {
    Vector v = new Vector();   //create a Vector object
    v.addElement(new Double(500.05));    //Add elements to Vector
    v.add(1000);
    v.add(842.987);
    v.add(0,23);
    v.add(3,900);
    System.out.println("Values="+v);
    v.remove(2);
    System.out.println("Values="+v);
    System.out.println("Size="+v.size());
    v.insertElementAt(200,2);
    System.out.println("Values="+v);
    v.clear();
    System.out.println("Values="+v);
  }   
}
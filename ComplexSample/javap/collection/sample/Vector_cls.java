import java.util.Vector;


public class Vector_cls
{
  public static void main(String[] args)
  {
    Vector v = new Vector();   //create a Vector object
    v.add(500);            //Add elements to Vector
    v.add(745);
    v.add(842);
    v.add(900);
    v.add(550);
    v.remove(2);
    System.out.println("Values="+v); 
  }   
}
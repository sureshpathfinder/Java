import java.util.*;
public class Iter
{
  public static void main(String[] args) 
  {
                ArrayList c = new ArrayList();
                c.add("Encapsulation");
                c.add("Abstraction");
                c.add("Inheritance");
                c.add("Polymorphism");
                System.out.println(c);
                Iterator ir = c.iterator();

                while (ir.hasNext()) {
                        System.out.println(ir.next());
                }
        }
}
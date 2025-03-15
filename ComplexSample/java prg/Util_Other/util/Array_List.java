import java.util.ArrayList;
class Array_List
{
  public static void main(String s[])
  {
    ArrayList a=new ArrayList();
    a.add(20);
    a.add(50);
    a.add(30);
    System.out.println("Before ="+a);
    a.add(20);
    a.add(5);
    System.out.println("After ="+a);
    a.remove(3);
    a.set(2,200);
    System.out.println("After Remove ="+a);
    System.out.println("Size of ArrayList ="+a.size());
   }
}
    
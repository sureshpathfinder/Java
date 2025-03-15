import java.util.*;

class hashset
{
 public static void main(String args[])
 {
  HashSet hs=new HashSet();
  hs.add("2");                     // DOESN'T ACCEPT THE DUPLICATE VALUES & IT IS UNSORTED
  hs.add("1");
  hs.add("0");
  System.out.println(hs);
 }
}
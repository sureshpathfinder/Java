import java.lang.*;

public class AppendInsert
{
  public static void main(String[] args) 
  {
    System.out.println("StringBuffer insert and append example!");
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.insert(0,"Dee"));   //First position
    int len = sb.length();
    System.out.println(sb.insert(len, "p"));   //last position
    System.out.println(sb.insert(4, "an"));    //Six position
    System.out.println(sb.append(" Raj"));   //Always last

  }
}
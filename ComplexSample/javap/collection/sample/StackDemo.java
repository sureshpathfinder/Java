import java.util.*;
public class StackDemo
{
static String[] s = {"January", "February", "March", "April","May", "June", "July", "August", "September","October", "November", "December" };
   public static void main(String[] args)
   {
     Stack stk = new Stack();
     for(int i = 0; i < s.length; i++)
       stk.push(s[i] + " ");
     System.out.println("Stack Elements = " + stk);
     stk.addElement("Next Year");
      System.out.println("Stack Elements = " + stk);
     System.out.println("element 5 = " + stk.elementAt(5));
     System.out.println("popping elements:");
     while(!stk.empty())
     {
       System.out.println(stk.pop());
     }
      System.out.println("Stack Elements = " + stk);
     
}
}
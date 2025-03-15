import java.util.*;
import java.text.SimpleDateFormat;

class Date
{
  public static void main(String s[])
  {
    Date td=new Date();
    SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
    String Today=d.format(d);
    System.out.println(Today);
  }
}
  
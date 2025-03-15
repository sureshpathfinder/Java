import java.util.StringTokenizer;

class Str_User_Delimiter
{
  public static void main(String args[])
  {
    String s="Welcome:To,Java;Program";
    StringTokenizer s1=new StringTokenizer(s,":,;");
    while(s1.hasMoreTokens())
    System.out.println(s1.nextToken());
  }
}
      
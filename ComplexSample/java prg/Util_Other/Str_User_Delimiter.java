import java.util.StringTokenizer;

class Str_User_Delimiter
{
  public static void main(String args[])
  {
    String s="Wel come:to ja,va";
    StringTokenizer s1=new StringTokenizer(s,": ,");
    while(s1.hasMoreTokens())
    System.out.println(s1.nextToken());
  }
}
      
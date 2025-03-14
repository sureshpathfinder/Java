import java.util.StringTokenizer;
class Stdemo
{
static String in="title=Java:The Java Handbook;"+"SSI PRESS;"+"SSI Limited;";
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer(in,"=;");
while(st.hasMoreTokens())
{
String key=st.nextToken();
String val=st.nextToken();
System.out.println(key+"\n"+val);
}
}
}

package sha;
public class Reverse
{
public String invert(String s)
{
StringBuffer sb=new StringBuffer(s);
return sb.reverse().toString();
}
}
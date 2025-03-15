class SB_Rev
{
static String Reverse(String data)
{
String rev=new String();
for ( int j=data.length()-1; j >= 0; j-- )
rev += data.charAt(j);
return rev;
}
public static void main ( String[] args )
{
System.out.println( Reverse("Welcome"));
}
}
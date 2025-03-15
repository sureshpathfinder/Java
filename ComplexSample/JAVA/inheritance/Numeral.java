import java.io.*;
class Numeral
{
public int x;
void getInt( )
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a no to find its square");
String s=br.readLine();
x=Integer.parseInt(s);
}
catch(IOException e)
{
}
}
}


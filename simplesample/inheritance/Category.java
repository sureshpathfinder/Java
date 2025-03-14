import java.io.*;
class Category extends Books
{
private String catcode;
void getDet()
{
super.getDet();
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter category code");
catcode=br.readLine();
}
catch(IOException e)
{
}
}
void showDet()
{
super.showDet();
System.out.println("showing category details.........");
System.out.println("======================");
System.out.println("category code ="+ catcode);
}
public static void main(String args[])
{
Category c=new Category();
c.getDet();
c.showDet();
}
}

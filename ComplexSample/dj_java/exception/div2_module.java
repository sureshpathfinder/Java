import java.util.*;
class div2_module
{
 public static void main(String arg[]) 
 {
 try
 {
 throws1 obj=new throws1();
 obj.display();
 } 
 catch(Exception e)
 {
  System.out.println(e+"Error : Enter non_zero input for B");
 }
 }
}


class throws1
{
void display() 
 {
 System.out.println("Enter the input for a & b ");
 Scanner obj=new Scanner(System.in);
  int n=obj.nextInt();
  int m=obj.nextInt();
  int r=n/m;
  System.out.println("Result="+r);
 }
}

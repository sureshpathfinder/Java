import javax.swing.*;
class Factorial
{
static int fact(int n)
{
if(n<=1)
return 1;
else
return n*fact(n-1);
}
}
class Recur
{
public static void main(String args[])
{
System.out.println(Factorial.fact(5));
int a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
 System.out.println(Factorial.fact(a));
JOptionPane.showMessageDialog(null,"The factorial value of "+a+" is= "+Factorial.fact(a),"Fact",JOptionPane.PLAIN_MESSAGE);
}
}
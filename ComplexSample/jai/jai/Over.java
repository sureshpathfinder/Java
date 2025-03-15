class Cons
 {
 Cons()
 {
System.out.println("\nDefault constructor");
 }
 Cons(int a)
 {
 System.out.println("\nSquare of "+a+"="+a*a);
 }
 Cons(float a,int b)
 {
 System.out.println("\nProduct="+a*b);
 }
 Cons(char a,char b)
 {
 System.out.println("\nNewcharacter="+(char)(a+b));
 }
 }
class Over
{
public static void main(String args[])
 {
Cons c=new Cons(10);
Cons c1=new Cons(78.90f,65);
Cons c2=new Cons('A',' ');
Cons c3=new Cons();
}
}
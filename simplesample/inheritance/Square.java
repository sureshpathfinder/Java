import java.io.*;
class Square extends Numeral
{
void  retSquare()
{
int y=(x*x);
System.out.println("square is "+ y);
}
public static void main(String args[])
{
Square s=new Square();
s.getInt();
s.retSquare();
}
}



class MainClass
{
public static void main(String args[])
{
Arith c=new Arith();
c.add();
c.sub();
c.div();
}
}


class Arith
{
int x,y,z=30;

void add()
{
x=10;
y=20;
System.out.println("Addition ="+(x+y));
}

void sub()
{
System.out.println("Subtraction ="+(x-y));
}

void div()
{
 
z=40;
 System.out.println("Division ="+(z/x));
}

}


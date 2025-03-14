class Cload
{
int a,b,c;
float g;
Cload(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
Cload(int a,int b)
{
this.a=a;
this.b=b;
}
Cload(float g)
{
this.g=g;
}
void display(int a,int b,int c)
{
System.out.println("a="+a+"\t"+"b="+b+"\t"+"c="+c);
}
void show(int a,int b)
{
System.out.println("a="+a+"\t"+"b="+b);
}
void print(float g)
{
System.out.println("g="+g);
}
public static void main(String args[])
{
Cload c=new Cload(10,20,30);
c.display();
Cload c1=new Cload(10,20);
c1.show();
Cload c2=new Cload(10.0f);
c2.print();
}
}

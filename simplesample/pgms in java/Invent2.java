class Invent2
{
int code,value;

Invent2()
{
code=0;
value=0;
}
Invent2(int x,int y)
{
code=x;
value=y;
}
void putData()
{
System.out.println("code :"+code);
System.out.println("value :"+value);
}
Invent2(Invent1 p)
{
code=p.getCode();
value=p.getItems()*p.getPrice();
}
public static void main(String args[])
{
Invent1 s1=new Invent1(100,5,140);
Invent2 d1=new Invent2();
//int total_value;
//total_value=s1;
d1=s1;
System.out.println("Product details - invent1 type");
s1.putData();
System.out.println("stock value");
System.out.println("value= "+value);
System.out.println("Product details-invent2 type");
d1.putData();
}
}

class Invent1
{
int code,items,price;

Invent1(int a,int b,int c)
{
code=a;
items=b;
price=c;
}
void putData()
{
System.out.println("code :"+code);
System.out.println("items :"+items);
System.out.println("value :"+price);
}
int getCode()
{
return code;
}
int getItems()
{
return items;
}
int getPrice()
{
return price;
}
 int operator()
{
return(items*price);
}
}
 
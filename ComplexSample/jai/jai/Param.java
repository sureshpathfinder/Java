class Complex
{
int rp,ip;
Complex()
{
rp=0;ip=0;
}
Complex(int r,int i)
{
rp=r;
ip=i;
}
Complex add(Complex c)
{
Complex res=new Complex();
res.rp=rp+c.rp;
res.ip=ip+c.ip;
return res;
}
void display()
{
System.out.println(rp+"+i"+ip);
}
}
class Param
{
public static void main(String args[])
{
Complex c1=new Complex(10,5);
Complex c2=new Complex(8,4);
Complex c3=new Complex();
c3=c1.add(c2);
c1.display();
c2.display();
c3.display();
}
}
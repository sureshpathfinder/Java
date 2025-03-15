class overload2
{ 
   public static void main(String ar[])
  {
    operat o1=new operat(2,3);
    o1.disp("o1");
    operat o2=new operat(4,6);
    o2.disp("o2");
    operat o3=new operat();
    o3=o1.add(o2);
    o3.disp("o3");
  }
}
class operat
{
  int rp,ip;
  operat()
  {
  }
  operat(int a,int b)
  {
    rp=a;
    ip=b;
  }
  
  operat add(operat c)
  {
    operat t=new operat();
    t.rp=rp+c.rp;
    t.ip=ip+c.ip;
    return t;
  }
  void disp(String s)
  {
    System.out.print("Object "+s);
    System.out.println("\t rp="+rp+"ip="+ip);
  }
}
    
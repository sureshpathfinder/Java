class M_super
{
  public static void main(String a[])
  {
    Bsuper good=new Bsuper();
    good.derived();
  }
}

class Asuper
{
  int a;
  Asuper(int aa)
  {
    a=aa;
    System.out.println(a);
  }
}


class Bsuper extends Asuper
{
  int b;
  
  Bsuper()
  {
    super(10);
    b=20;
  }
  void derived()
  {
    System.out.println(a+b);
  }
}


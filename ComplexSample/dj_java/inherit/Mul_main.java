class Mul_main
{
  
  public static void main(String args[])
  {
    int s;
    multiple m=new multiple();
    m.show();
    s=m.display(100);
    System.out.println("Base class 2="+s);
  }
}

class multiple implements Inter_multiple1,Inter_multiple2
{
  public void show()
  {
    System.out.println("Base class 1= "+a);
  }
  
  public int display(int a)
  {
       return a;
  }
}


             
  
  
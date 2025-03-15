class overload2
{
  void disp()
  {
    System.out.println("Simple method Overloading");
  }
  void disp(int a,int b)
  {
    System.out.println("a="+a+"b="+b);
  }
  void disp(String n)
  {
    System.out.println("String n="+n);
  }
  public static void main(String ar[])
  {
    overload2 o=new overload2();
    o.disp();
    o.disp(2,4);
    o.disp("hello");
  }
}

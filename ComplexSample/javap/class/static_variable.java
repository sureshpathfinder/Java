class static_variable
{
  public static void main(String ar[])
  {
    student s1=new student();
    s1.disp();
    s1.disp();
    s1.disp();
    s1.disp();
    student s2=new student();
    s2.show();
  }
}
class student
{
  static int a=4;
 
  void disp()
  {
    
    ++a;
  }
  void show()
  {
    System.out.println("a="+a);
  }
}

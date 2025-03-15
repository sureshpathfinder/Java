class program
{
  public static void main(String ar[])
  {
    student s1=new student();
    s1.get(1,"Ravi");
    s1.disp();
  }
}
class student
{
  int rno;
  String name;
  void get(int i,String n)
  {
    rno=i;
    name=n;
  }
  void disp()
  {
    System.out.println("Rno="+rno);
    System.out.println("Name="+name);
  }
}

class p_java
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
  void get(int rno,String name)
  {
    this.rno=rno;
    this.name=name;
  }
  void disp()
  {
    System.out.println("Rno="+rno);
    System.out.println("Name="+name);
  }
}

class constructor1
{
  public static void main(String ar[])
  {
    student s1=new student(10,"Ravi");//PARAMETERISED CONSTRUCTOR
    
    student s2=new student();//DEFAULT CONSTRUCTOR
    student s3=new student(2,4);
    s1.disp();
  }
}
class student
{
  int rno;
  String name;
  student()
  {
     System.out.println("Default Constructor");
  }
  student(int a,int b)
  {
    System.out.println("a="+a+"b="+b);
  }
  student(int i,String n)
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

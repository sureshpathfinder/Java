interface I1 
{
    int a=10;
    void test(int i);
}
interface I2 
{
    void test(String s);
}


public class multiple implements I1, I2
{
  public void test(int i) 
  {
    System.out.println("In MultInterfaces.I1.test\n a="+a);
  }
  public void test(String s)
  {
    System.out.println("In MultInterfaces.I2.test");
  }
  public static void main(String[] a)
  {
   multiple t= new multiple();
    t.test(42);
    t.test("Hello");
  }
}


class overloading 
{
    void disp()
    {
      System.out.println("Method 1");
    }
    void disp(int a)
    {
      System.out.println("Method "+a);
    }
    int disp(int f,int f1)
    {
      System.out.println("Method "+(f+f1));
      return 0;
    }
    public static void main(String args[])
  {
  overloading ol=new overloading();
  ol.disp();
  ol.disp(2);
  ol.disp(1,2);
  }
}
      
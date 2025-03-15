class Array
{
  public static void main(String s[])
  {
    int a[]={10,20,30};
    for(int i=0;i<3;i++)
    {
      System.out.println("Before ="+a[i]);
    }
    
    a[3] =40;
    for(int i=0;i<4;i++)
    {
      System.out.println("after ="+a[i]);
    }
  }
}
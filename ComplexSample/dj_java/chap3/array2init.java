class array2init
{
public static void main(String args[])
{
int a [ ] [ ]=   { { 1, 2, 3, 4},
                      { 1, 2, 3},
                      { 1, 2, 3, 4, 5}, 
                      { 1, 2, 3, 4, 5, 6, 7} } ;
  for(int i=0;i<a.length;i++)
  {
  for(int j=0;j<a[i].length;j++)
    {
      System.out.print("\t a["+i+"]["+j+"] : "+a[i][j]);
    }
   System.out.println();
  }
System.out.println(a[2][3]);
}

}
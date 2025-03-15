class twodim
{
  public static void main(String args[]) 
{
    int m[][] = {{ 0, 2},{ 5, 3 } };
    int i, j;

    for(i=0; i<2; i++)
{
      for(j=0; j<2; j++)
        System.out.print(m[i][j] + " ");
      System.out.println();
    }
  }
}

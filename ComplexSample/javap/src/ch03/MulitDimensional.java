class MulitDimensional
{
	public static void main(String args[])
	{
		int a[][][]=new int[3][4][5];
		System.out.println("Length is "+a.length);
		for(int i=0;i<=a.length-1;i++)
			for(int j=0;j<=a.length-1;j++)
				for(int k=0;k<=a.length-1;k++)
					a[i][j][k]=i+j+k;
		for(int l=0;l<=2;l++)
		{
			for(int m=0;m<=3;m++)
			{
				for(int n=0;n<=4;n++)
				{
					System.out.print(a[l][m][n]);
				}
			System.out.println(" ");
			}
		System.out.println(" ");
		}
	}
}	

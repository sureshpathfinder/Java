class  ArraysofArrays
{
	public static void main(String args[])
	{
		int a[][]=new int[5][5];System.out.println("The length is "+a.length);
		for(int i=0;i<=a.length-1;i++)
			for(int j=0;j<=a.length-1;j++)
			{
				a[i][j]=i*j;
			
			}
		for(int k=0;k<=a.length-1;k++)
		{
			for(int l=0;l<=a.length-1;l++)
			{
				System.out.print(a[k][l]);
			}
		System.out.println(" ");
		}	
	}
}


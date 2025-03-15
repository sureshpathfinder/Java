/*
Double Dimension Array
syn 
int marks[ ][ ];
marks = new int [3] [3];
*/
class multiarray
{
         public static void main(String args[])
         {
	int td[ ][ ] = new int[3][3];
	int i,j,k;
	k=0;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			td[i][j]=k;
			k++;
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.print(td[i][j]+" ");
		}
	System.out.println();
	 }
         }
}


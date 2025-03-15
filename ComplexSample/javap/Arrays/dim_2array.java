import java.io.*;
class dim_2array
{
public static void main(String args[]) throws IOException
{
int m[][]=new int[2][2];

int i, j;
for(i=0; i<2; i++) 
{
  for(j=0; j<2; j++)
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	m[i][j]=Integer.parseInt(br.readLine());
}
}
for(i=0; i<2; i++) 
{
  for(j=0; j<2; j++)
{
     System.out.print(m[i][j] + " ");

}
System.out.println();
}
}
}

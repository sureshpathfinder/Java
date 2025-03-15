import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][][]=new int[2][3][3];
System.out.println("Enter the 1st Matrix elements");
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
a[0][i][j]=s.nextInt();
System.out.println("Enter the 2ND Matrix elements");
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
a[1][i][j]=s.nextInt();
System.out.println("The resultant matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
System.out.print(a[0][i][j]+a[1][i][j]+" ");
System.out.println();
}
}
}

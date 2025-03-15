import java.util.*;
class For
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[3][3];
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
a[i][j]=s.nextInt();
for(int val[]:a)
{
for(int y:val)
System.out.println(y);
}
}
}
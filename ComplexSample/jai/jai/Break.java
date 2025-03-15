class Break
{
public static void main(String args[])
{
label: for(int j=1;j<=5;j++)
{
for(int i=1;i<=5;i++)
{
if(j==3)
continue label;
System.out.println(i);
}
}
}
}

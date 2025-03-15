//sorting
 class sort
{
public static void main(String args[])
{
int a[]={2,5,7,8,10,9,3,6,1,4};
int i,j,temp=0;
for (i=0;i<a.length;i++)
{	System.out.println("The numbers in ascending order are:");
for(i=0;i<10;i++)
System.out.println(a[i]);
        for(j=0;j<a.length-1;j++)
	{
	if (a[j]>a[j+1])
	{
        temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
                 }        
	 if (a[j]<a[j+1])
	{
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}
	
	}
}

System.out.println("The numbers in decending order are:");
for(j=0;j<10;j++)
System.out.println(a[j]);
}
}


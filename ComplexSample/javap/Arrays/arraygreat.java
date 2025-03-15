//To find the greatest number.
class arraygreat
{
public static void main(String args[])
{
	int a[]={10,20,30,40,50};int i;
	int gr;
	int sm;
	gr=a[0];
	sm=a[0];
	System.out.println("The value of gr"+gr);
	System.out.println("The value of sm "+sm);
	for(i=0;i<5;i++)
	{
		if(gr<a[i])
		gr=a[i];
		else if(sm>a[i])
		sm=a[i];
	}
	System.out.println("Greatest is  :"+gr);
	System.out.println("Smallest is  :"+sm);

}
}
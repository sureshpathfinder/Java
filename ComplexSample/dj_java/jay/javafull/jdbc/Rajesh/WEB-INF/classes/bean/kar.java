class loop
{
public static void main(String arg[ ])
{
int x, y;
outer:
	for(x=1;x<=5;x++)
	{
	for(y=1;y<=x;y++)
	{
	System.out.print(y+"\t");
	if(y==3)
	break;
	}
System.out.print("\n");
}
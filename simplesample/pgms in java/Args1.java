class Args1
{
public static void main(String args[])
{
if(args.length!=2)
{
System.out.println("enter 2 no");
System.exit(0);
}
int c=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
System.out.println("c="+c);
}
}

class Controlstmt
{
public static void main(String ar[])
{
int i=3;
//If Statement
if(i%2==0)
 System.out.println("The number is Even");
else
 System.out.println("The number is Odd");

//looping Structures
for(int j=0;j<10;j++)
{
 System.out.print("   "+j);
}

int c,b=2;
c=1<<b;
 System.out.println(" \n Bitwise for Left Shift of 2="+c);

int m=-5;
c=~m;
System.out.println(" \n One`s Complement of -5="+c);


}
}

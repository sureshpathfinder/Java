public class InnerDownLoadClass 
{
private final static int size = 20;
private int[] arrayOfIntger = new int[size];

public InnerClass()
{
for (int i = 0; i < size; i++) 
{
arrayOfIntger[i] = i;
}
}

public void even()
{
GetEvenInteger integer = this.new GetEvenInteger();
while (integer.hasNext()) 
{
System.out.println(integer.getNext() + " ");
}
}

private class GetEvenInteger 
{
private int next = 0;
public boolean hasNext() 
{
return (next <= size - 1);
}

public int getNext() 
{
int value = arrayOfIntger[next];
next += 2;
return value;
}
}

public static void main(String args[]) 
{
InnerDownLoadClass innerClass = new InnerDownLoadClass();
System.out.println("The Even integers are: ");
innerClass.even();
}
}
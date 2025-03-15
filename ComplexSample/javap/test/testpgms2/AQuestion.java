public class AQuestion
{
public void method(Object o)
{
System.out.println("Object Verion");
}
public void method(String s)
{
System.out.println("String Version");
}
/*public void method(StringBuffer sb)
{
System.out.println("StringBuffer Verion");
}*/
public static void main(String args[])
{
AQuestion question = new AQuestion();
question.method(0);
}
}

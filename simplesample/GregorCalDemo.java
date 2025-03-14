import java.util.*;
class GregorCalDemo
{
public static void main(String args[])
{
String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
int year;
GregorianCalendar gcal=new GregorianCalendar();
System.out.println("The date is");
System.out.println(months[gcal.get(Calendar.MONTH)]);
System.out.println(""+gcal.get(Calendar.DATE)+"");
System.out.println(year=gcal.get(Calendar.YEAR));
System.out.println("The time is");
System.out.println( gcal.get(Calendar.HOUR)+":");
System.out.println( gcal.get(Calendar.MINUTE)+":");
System.out.println( gcal.get(Calendar.SECOND));
if(gcal.isLeapYear(year))
{
System.out.println( "This is a leap year");
}
else
{
System.out.println( "This is not a leap year");
}
}
}



import java.util.*;

class date1
{
	public static void main(String args[])throws Exception
	{
		Date d=new Date();
		System.out.println(d.getYear());
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));

		System.out.print(c.get(Calendar.HOUR)+":");
		System.out.print(c.get(Calendar.MINUTE)+":");
		System.out.print(c.get(Calendar.SECOND)+"\n");

		GregorianCalendar ge=new GregorianCalendar();
		System.out.println(ge.get(Calendar.YEAR));
		if(ge.isLeapYear(ge.get(Calendar.YEAR)))
			System.out.println("this is leap year");
		else
			System.out.println("this is not a leap year");

	}
}
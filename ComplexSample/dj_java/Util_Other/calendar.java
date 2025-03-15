import java.util.*;
class calendar
{
        public static void main(String args[])
        {
                GregorianCalendar g=new GregorianCalendar();
                System.out.print("Date = \t"+g.get(Calendar.DATE)+"/");
                System.out.print(g.get(Calendar.MONTH)+"/");
                int year=g.get(Calendar.YEAR);
                System.out.print(year);
                System.out.print("\nToday Time:"+"\t  ");
                System.out.print(g.get(Calendar.HOUR)+":");
                System.out.print(g.get(Calendar.MINUTE)+":");
                System.out.println(g.get(Calendar.SECOND));
               
                if(g.isLeapYear(year))
                System.out.println("Leap Year");
                  else
                System.out.println("Not a Leap Year");
        }
}
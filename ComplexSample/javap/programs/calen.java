import java.util.*;
class calen
{
        public static void main(String args[])
        {
                String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul",
                                 "Aug","Sep","Oct","Nov","Dec"};
                GregorianCalendar gscale=new GregorianCalendar();
                int year=gscale.get(Calendar.YEAR);
                int date=gscale.get(Calendar.DATE);
                int mon=gscale.get(Calendar.MONTH);
                System.out.println("\n\t CALENDAR CLASS MANIPULATION");
                System.out.println("\t-----------------------------");
                System.out.println("Date:"+date+" "+month[mon]+" "+year);
                 if(gscale.isLeapYear(year))
                 {
                        System.out.println("This Year is a leap year");
                 }
                 else
                 {
                        System.out.println("this Year is not a leap year");
                 }
       }
}

                                

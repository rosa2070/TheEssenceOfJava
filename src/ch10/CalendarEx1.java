package ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH));
        System.out.println(today.get(Calendar.WEEK_OF_YEAR));
        System.out.println(today.get(Calendar.WEEK_OF_MONTH));
        System.out.println(today.get(Calendar.DATE));
        System.out.println(today.get(Calendar.DAY_OF_MONTH));
        System.out.println(today.get(Calendar.DAY_OF_YEAR));
        System.out.println(today.get(Calendar.DAY_OF_WEEK));
        System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(today.get(Calendar.AM_PM));
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.HOUR_OF_DAY));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        System.out.println(today.get(Calendar.MILLISECOND));
        System.out.println(today.get(Calendar.ZONE_OFFSET));
        System.out.println(today.getActualMaximum(Calendar.DATE));



    }
}

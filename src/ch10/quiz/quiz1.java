package ch10.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class quiz1 {
    public static void main(String[] args) {
        for (int month=1; month<=12; month++) {
            Calendar sDay = Calendar.getInstance();
            Calendar eDay = Calendar.getInstance();


            sDay.set(2010, month-1, 1);
            eDay.set(2010, month-1, sDay.getActualMaximum(Calendar.DATE));

        }


    }
}

package ch10.quiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class quiz6 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(2000,1, 1);
        LocalDate now = LocalDate.now();

        long days = birthDay.until(now, ChronoUnit.DAYS);

        System.out.println("birthDay = " + birthDay);
        System.out.println("today = " + now);
        System.out.println("days = " + days);
    }
}

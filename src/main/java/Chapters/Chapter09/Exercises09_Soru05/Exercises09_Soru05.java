package Chapters.Chapter09.Exercises09_Soru05;

import java.util.GregorianCalendar;

public class Exercises09_Soru05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("year: " + year + "\t\tmonth: " + month + "\t\tday: " + day);

        calendar.setTimeInMillis(1234567898765L);

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("year: " + year + "\t\tmonth: " + month + "\t\tday: " + day);

    }
}

package Chapters.Chapter09.Exercises09.Exercises09_Soru03;

import java.util.Date;

public class Exercises09_Soru03 {
    public static void main(String[] args) {
        long startElapsedNum = 10_000;
        long endElapsedNum = 100_000_000_000L;
        Date date = new Date();
        for (long i = startElapsedNum; i < endElapsedNum; i *= 10) {

            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}


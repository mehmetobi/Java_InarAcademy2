package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru02 {

    public static int sum_digits(long n) {

        long sum = 0, count;
        if (n < 0) {
            n *= -1;
        }
        while (n != 0) {
            count = n % 10;
            sum = sum + count;
            n /= 10;

        }


        return (int) sum;
    }
}

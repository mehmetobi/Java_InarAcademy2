package Chapters.Chapter05;

public class Exercises05_Soru04 {
    public static void main(String[] args) {

        final double KILOMETERS_PER_MILE = 1.609;


        System.out.println(
                "Miles        Kilometers");


        for (int i = 1; i <= 10; i++) {
            System.out.println("" + i + " \t\t" + (i * KILOMETERS_PER_MILE));
        }
    }
}

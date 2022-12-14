package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru13 {
    public static void main(String[] args) {
        getSumSeries(20);
    }

    public static void getSumSeries(double i) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("-----------------------------------------------");
        double m = 0;
        for (double j = 1; j <= i; j++) {
            m += j / (j + 1);
            System.out.printf("%-12.0f %1.4f\n", j, m);
        }
    }
}

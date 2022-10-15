package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru29 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (Exercises06_Soru26.isPrime(i) && Exercises06_Soru26.isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2 + ")"));
            }

        }
    }
}

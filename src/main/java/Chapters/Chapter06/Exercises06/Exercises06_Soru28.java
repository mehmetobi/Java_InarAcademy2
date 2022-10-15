package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru28 {
    public static void main(String[] args) {
        System.out.printf("%-15s %s\n", "p", "2^p-1");
        System.out.println("--------------------------");
        for (int p = 2; p <= 31; p++) {
            if (Exercises06_Soru26.isPrime(p) && Exercises06_Soru26.isPrime((int) (Math.pow(2, p) - 1))) {
                System.out.printf("%-15d %d\n", p, (int) Math.pow(2, p) - 1);
            }
        }


    }

}

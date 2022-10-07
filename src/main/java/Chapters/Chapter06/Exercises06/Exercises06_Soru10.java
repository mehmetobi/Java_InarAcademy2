package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i > 0; i--) {
            if (isPrime(i)) {
                System.out.print(i);
                count++;
                System.out.print(count % 10 == 0 ? "\n" : "\t");
            }

        }
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

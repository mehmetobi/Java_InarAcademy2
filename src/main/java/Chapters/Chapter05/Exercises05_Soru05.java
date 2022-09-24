package Chapters.Chapter05;

public class Exercises05_Soru05 {
    public static void main(String[] args) {

        final double POUNDS_PER_KILOGRAM = 2.2;

        System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.print("" + k + " \t\t" + String.format("%.2f", k * POUNDS_PER_KILOGRAM) + "\t|\t");
            System.out.println("" + p + " \t\t" + String.format("%.2f", p * POUNDS_PER_KILOGRAM));

        }
    }}
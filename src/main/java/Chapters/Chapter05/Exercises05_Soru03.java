package Chapters.Chapter05;

public class Exercises05_Soru03 {
    public static void main(String[] args) {

        final double POUNDS_PER_KILOGRAM = 2.2;

        System.out.println("Kilograms\t\tPounds");


        for (int i = 1; i <= 199; i += 2) {
            System.out.println("" + i + " \t\t\t" + (i * POUNDS_PER_KILOGRAM));
        }
    }
}

package Chapters.Chapter05;

public class Exercises05_Soru18_Pattern_A {
    public static void main(String[] args) {

        System.out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }


    }
}

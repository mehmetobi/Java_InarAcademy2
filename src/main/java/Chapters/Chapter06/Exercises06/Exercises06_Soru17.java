package Chapters.Chapter06.Exercises06;

import java.util.Scanner;

public class Exercises06_Soru17 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println(" Bir n degeri giriniz: ");
        int n = klavye.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}

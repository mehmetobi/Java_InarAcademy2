package Chapters.Chapter06.Exercises06;

import java.util.Scanner;

public class Exercises06_Soru20 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println(" Bir kelime giriniz: ");
        String s = klavye.nextLine();
        System.out.println(countLetters(s));
    }




    public static int countLetters(String s) {
        int countLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                countLetters++;
            }
        }
        return countLetters;
    }
}

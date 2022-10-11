package Chapters.Chapter06.Exercises06;

import java.util.Scanner;

public class Exercises06_Soru03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to learn is it palindrom :");
        int integer = input.nextInt();
        if (isPalindrom(integer)) {
            System.out.println("The reverse of " + integer + " is " + reverse(integer) + " Yes it is a palindrom");
        } else {
            System.out.println("The reverse of " + integer + " is " + reverse(integer) + " No it is not a palindrom");
        }
    }


    public static int reverse(int number) {
        String s = number + "";
        int length = s.length();
        String reverseS = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseS += s.charAt(i);
        }
        return Integer.parseInt(reverseS);
    }

    public static boolean isPalindrom(int number) {
        return (number == reverse(number)) ? true : false;
    }
}

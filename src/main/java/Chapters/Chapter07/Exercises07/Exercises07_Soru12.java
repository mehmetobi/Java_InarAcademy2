package Chapters.Chapter07.Exercises07;

import java.util.Scanner;

public class Exercises07_Soru12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double [] reverse = reverse(numbers);
        for (int i = 0; i < reverse.length ; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
    public static double[] reverse(double[] numbers){
        double[] reverse = new double[numbers.length];
        for (int i = 0,j= numbers.length-1; i < numbers.length; i++,j--) {

            reverse[i] = numbers[j];

        }
        return reverse;
    }
}

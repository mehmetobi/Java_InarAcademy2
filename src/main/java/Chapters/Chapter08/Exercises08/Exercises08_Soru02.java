package Chapters.Chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_Soru02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] numbers = new double[4][4];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(numbers));
}
    public static double sumMajorDiagonal(double[][] numbers){
        double sum = 0;

        for (int i = 0 ; i < numbers.length ; i++) {
            //System.out.println(numbers[i][i]);
            sum += numbers[i][i];
        }

        return sum;
    }
}
package Chapters.Chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_Soru01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] numbers =new double[3][4];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = input.nextDouble();
            }
        }
        for (int columnIndex = 0; columnIndex < numbers[0].length; columnIndex++) {
            System.out.println( "Sum of the elements at column " + columnIndex + " is " + sumColumn(numbers, columnIndex));
        }

    }


    public static double sumColumn(double[][] numbers, int columnIndex) {
        double sum = 0;

        for (int row = 0; row < numbers.length; row++) {
            sum += numbers[row][columnIndex];
        }

        return sum;
    }
}

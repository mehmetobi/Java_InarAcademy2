package Chapters.Chapter12.Exercises12.Exercises12_Soru09;

import java.util.Scanner;

public class Exercises12_Soru09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryString = input.nextLine();
        try {
            System.out.println(binaryString + " = decimal of " + bin2Dec(binaryString));
        } catch (BinaryFormatException ex) {
            System.out.println("Value must be binary!");
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int sum = 0;

        for (int j = 0, i = binaryString.length() - 1; i >= 0; i--, j++) {
            if (binaryString.charAt(i) == '1') {
                sum += Math.pow(2, j) * 1;
            } else if (binaryString.charAt(i) == '0') {
                sum += Math.pow(2, j) * 0;
            } else {
                throw new BinaryFormatException("Invalid input");
            }
        }
        return sum;
    }
}

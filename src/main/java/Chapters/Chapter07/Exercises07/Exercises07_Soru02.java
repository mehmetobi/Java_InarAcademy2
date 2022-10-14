package Chapters.Chapter07.Exercises07;

import java.util.Scanner;

public class Exercises07_Soru02 {
    public static void main(String[] args) {
        // TestReversedArray();
        final int numberOfIntegers = 10;
        int[] numbers = new int[numberOfIntegers];


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
            printArray(numbers);


//TODO YAZDIR METODO YAZILACAK.... METOT MAINDE ÇAĞIR...SCANNER.


            //  int[] testArray = {1, 2, 3, 4, 5, 6};
            //ReverseArray(testArray);
        }


        /*public static void TestReversedArray () {


            int[] testArray = {1, 2, 3, 4, 5, 6};
            int[] r = ReverseArray(testArray);

            int[] expectedArray = {6, 5, 4, 3, 2, 1};
            assert Arrays.equals(r, expectedArray);


            int[] testArray2 = {1, -2, 3, -4, 5, 6};
            int[] k = ReverseArray(testArray2);
            int[] expectedArray2 = {6, 5, -4, 3, -2, 1};
            assert Arrays.equals(k, expectedArray2);

            int[] testArray3 = {1, 1, 1, 1, 1, 1};
            int[] l = ReverseArray(testArray3);
            int[] expectedArray3 = {1, 1, 1, 1, 1, 1};
            assert Arrays.equals(l, expectedArray3);

            int[] testArray4 = {1, 2, 3, 3, 2, 1};
            int[] m = ReverseArray(testArray4);
            int[] expectedArray4 = {1, 2, 3, 3, 2, 1};
            assert Arrays.equals(m, expectedArray4);

*/


    public static int[] ReverseArray(int[] numbers) {

        for (int i = 0; i <= (numbers.length / 2) - 1; i++) {

            int template = numbers[i];


            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = template;
        }


        return numbers;
    }

    public static void printArray(int[] numbers) {
        int reverseArray[] = ReverseArray(numbers);
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.println(reverseArray[i]);

        }

    }
}

package Chapters.Chapter07.Exercises07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_Soru15 {

    public static void main(String[] args) {
        test_eliminateDuplicates();
        int[] list = new int [10] ;
        System.out.println(" Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        for(int i= 0; i < list.length; i++ ){
            list[i]= input.nextInt();
        }

        eliminateDuplicates(list);

    }

    public static void test_eliminateDuplicates() {

        int[] testArray = {10, 10, 10, 10, 10};
        assert (Arrays.equals(eliminateDuplicates(testArray), new int[]{10})) ;

        int[] testArray2 = {-40, -20, -20, -40, -50};
        assert (Arrays.equals(eliminateDuplicates(testArray2), new int[]{-40, -20, -50})) ;

        int[] testArray3 = {0, 1, 1, -2, -2};
        assert (Arrays.equals(eliminateDuplicates(testArray3), new int[]{0, 1,-2})) : eliminateDuplicates(testArray3);

        int[] testArray4 = {10, 20, 4, 40, 10};
        assert (Arrays.equals(eliminateDuplicates(testArray4), new int[]{10,20,4,40})) ;

    }

    private static boolean contains(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toCheckValue) {
                test = true;
                break;
            }
        }
        return test;
    }

    public static int[] eliminateDuplicates(int[] list){

        if(list.length == 0)
            return list;

        int[] eliminated_list = new int[list.length];
        eliminated_list[0] = list[0];

        int count = 1;

        for (int i = 1; i < list.length ; i++){
            if(!contains(eliminated_list, list[i])){
                eliminated_list[count] = list[i];
                count++;
            }

        }

        //System.out.println(Arrays.toString(eliminated_list));

        int[] newArray = Arrays.copyOfRange(eliminated_list, 0, count);
        System.out.println(Arrays.toString(newArray));

        return newArray ;
    }
}


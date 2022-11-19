package Chapters.Chapter11.Exercises11.Exercises11_Soru11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises11_Soru11 {
    public static void main(String[] args) {
        System.out.println("Enter 5 integers:");
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            list.add(input.nextInt());
        }

        sort(list);
        for (int i = 0; i < list.toArray().length; i++) {
            System.out.print(list.get(i));
        }

    }

    public static void sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {
                    int value = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, value);
                }
            }


        }
    }
}

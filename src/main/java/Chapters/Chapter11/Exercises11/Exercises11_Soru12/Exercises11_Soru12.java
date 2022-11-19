package Chapters.Chapter11.Exercises11.Exercises11_Soru12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises11_Soru12 {
    public static void main(String[] args) {
        System.out.println("Enter 5 integers:");
        ArrayList<Double> list = new ArrayList<Double>(5);
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            list.add(input.nextDouble());
        }

        System.out.print(sum(list));
    }


    public static double sum(ArrayList<Double> list) {
        double data = 0;

        for (int i = 0; i < list.size(); i++) {
            data += list.get(i);

        }
        return data;
    }
}

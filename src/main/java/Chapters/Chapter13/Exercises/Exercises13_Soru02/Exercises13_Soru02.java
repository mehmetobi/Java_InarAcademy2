package Chapters.Chapter13.Exercises.Exercises13_Soru02;

import java.util.ArrayList;
import java.util.Collections;

public class Exercises13_Soru02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);

        System.out.println("Before shuffle: \n" + list.toString());
        shuffle(list);
        System.out.println("After shuffle: \n" + list.toString());


    }

    public static void shuffle(ArrayList<Number> list) {
        Collections.shuffle(list);
    }
}

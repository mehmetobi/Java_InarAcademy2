package Chapters.Chapter11.Exercises11.Exercises11_Soru07;

import java.util.ArrayList;

public class Exercises11_Soru07 {
    public static void main(String[] args) {
        // Also can be shuffled by the Collections.shuffle.
        // Collections.shuffle(list);

        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        shuffle(list);


        for (int i = 0; i < list.toArray().length; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list) {

        for (int i = 0; i < list.toArray().length; i++) {
            int index1 = (int) (Math.random() * list.size());
            int index2 = (int) (Math.random() * list.size());
            int value = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, value);

        }
    }
}

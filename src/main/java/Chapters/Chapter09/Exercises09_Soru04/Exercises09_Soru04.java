package Chapters.Chapter09.Exercises09_Soru04;

import java.util.Random;

public class Exercises09_Soru04 {

    public static void main(String[] args) {
        Random obj = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.println(obj.nextInt(100));

        }

    }

}

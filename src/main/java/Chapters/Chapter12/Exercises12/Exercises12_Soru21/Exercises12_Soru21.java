package Chapters.Chapter12.Exercises12.Exercises12_Soru21;

import java.io.File;
import java.util.Scanner;

public class Exercises12_Soru21 {
    public static void main(String[] args) throws Exception {
        File file = new File("SortedStrings.txt");
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        String s1 = "";
        String s2 = "";
        boolean isSorted = true;

        try
                (Scanner input = new Scanner(file)) {
            int count = 0;
            while (input.hasNext() && isSorted) {
                if (count % 2 == 0) {
                    s1 = input.next();
                    s2 = input.next();
                    count++;
                } else {
                    s1 = s2;
                    s2 = input.next();
                }
                if (s1.compareTo(s2) > 0) {
                    System.out.println(s1 + " and " + s2 + " is out of order");
                    isSorted = false;
                }
            }

        }
        if (isSorted) {
            System.out.println("The data is in increasing order.");
        }
    }
}

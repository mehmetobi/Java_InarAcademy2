package Chapters.Chapter12.Exercises12.Exercises12_Soru16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercises12_Soru16 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            return;
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }
        StringBuilder s2 = new StringBuilder();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                s2.append(s1.replaceAll(args[1], args[2]) + "\n");
            }
        }
        PrintWriter output = new PrintWriter(file);
        output.print(s2);
        output.close();
    }
}

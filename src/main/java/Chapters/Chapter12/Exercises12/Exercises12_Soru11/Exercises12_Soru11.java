package Chapters.Chapter12.Exercises12.Exercises12_Soru11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercises12_Soru11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage java Exercise12_11 String fileName");
            return;
        }
        File file = new File(args[1]);
        String toRemove = args[0];
        String s1 = "";
        String s2 = "";

        if (!file.exists()) {
            System.out.println("The file " + file.getName() + " does not exist");
            return;
        }
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s1 += input.nextLine() + "\n";
                s2 = s1.replaceAll(toRemove, "");
            }

        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print(s2);
        }


    }
}

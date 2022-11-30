package Chapters.Chapter12.Checkpoints_12;

import java.io.*;
import java.util.Scanner;

public class File_With_Exception {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/ubuntu/Desktop/sample3.txt");

        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }



    }
}

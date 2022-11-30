package Chapters.Chapter12.Checkpoints_12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Add_String_to_Txt {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/ubuntu/Desktop/sample3.txt");

        Scanner scan = new Scanner(file);


        String fileContent = "ŞAMPİYON MESSİ \n";
        while (scan.hasNext()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("/home/ubuntu/Desktop/sample3.txt");
        writer.write(fileContent);
        writer.close();
    }
}

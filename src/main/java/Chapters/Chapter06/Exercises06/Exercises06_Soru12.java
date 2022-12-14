package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int character = ch1;
        int count = 0;
        while (ch1 <= character && character <= ch2) {
            System.out.print((char) character);
            character++;
            count++;
            System.out.print(count % numberPerLine == 0 ? "\n" : "\t");
        }

    }


}


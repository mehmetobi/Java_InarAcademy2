package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru01TEST {
    public static void main(String[] args) {

        for (int i = 1; i < 101 ; i++){
            System.out.print(Exercises06_Soru01.getPentagonalNumber(i) + " ");
            if(i %10 == 0){
                System.out.println();
        }
        }
    }
}

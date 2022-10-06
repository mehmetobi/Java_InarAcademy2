package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru06 {
    public static void main(String[] args) {
displayPattern(7);
    }

    public static void displayPattern(int n) {
    for(int i=1; i<= n; i++) {
        for(int j = n- i; j>0; j--){
            System.out.print("  ");
        }
        for(int k=i; k>0; k--){
            System.out.print(k+" ");
        }
        System.out.println();
    }

    }
}
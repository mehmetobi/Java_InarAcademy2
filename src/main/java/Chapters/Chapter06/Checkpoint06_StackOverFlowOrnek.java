package Chapters.Chapter06;

public class Checkpoint06_StackOverFlowOrnek {
    public static void main(String[] args) {
        metod(0);

    }

     static void metod(int derinliksayaci) {
        if(derinliksayaci== 1000){
            return;
        }
        derinliksayaci++;
         System.out.println(derinliksayaci);
         metod(derinliksayaci);
    }
}

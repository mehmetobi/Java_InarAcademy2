package Chapters.Chapter12.Exercises12.Exercises12_Soru10;

public class Exercises12_Soru10 {
    public static void main(String[] args) {
        try{
            int[] arr = new int[1000000000 *100000000];
        }catch (OutOfMemoryError ex){
            System.out.println("OutOfMemoryError: " + ex);
        }
    }
}

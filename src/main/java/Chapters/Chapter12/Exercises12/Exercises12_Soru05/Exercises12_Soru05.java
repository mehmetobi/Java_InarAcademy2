package Chapters.Chapter12.Exercises12.Exercises12_Soru05;

public class Exercises12_Soru05 {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle( 2, 3, 7);
        } catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }

}

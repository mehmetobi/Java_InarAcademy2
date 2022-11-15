package Chapters.Chapter10.Exercises10_Soru02;

public class Exercises10_Soru02 {

    public static void main(String[] args) {
        BMI bmı = new BMI("mehmet", 26, 73, 174);
        System.out.println(bmı.getBMI() + " " + bmı.getStatus());
    }
}

package Chapters.Chapter10.Exercises10_Soru14;

public class Exercises10_Soru14 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        MyDate myDate1 = new MyDate(34355555133101L);
        System.out.println("myDate --> " + myDate.toString());
        System.out.println("myDate1 --> " + myDate1.toString());
        myDate1.setDate(561555550000L);
        System.out.println("updated myDate1 --> " + myDate1.toString());
    }
}

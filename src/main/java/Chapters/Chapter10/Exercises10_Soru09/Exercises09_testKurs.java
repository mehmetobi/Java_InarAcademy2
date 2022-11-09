package Chapters.Chapter10.Exercises10_Soru09;

public class Exercises09_testKurs {
    public static void main(String[] args) {
        Kurs kurs1 = new Kurs("Java Kursu");
        Kurs kurs2 = new Kurs("Tester Kursu");

        kurs1.ogrenciEkle("Erdem");
        kurs1.ogrenciEkle("Nuri");
        kurs1.ogrenciEkle("Emre");

        kurs2.ogrenciEkle("Tarık");
        kurs2.ogrenciEkle("Süleyman");

        System.out.println("Java kursu öğrenci sayisi: " + kurs1.getOgrenciSayisi());
        String[] students = kurs1.getOgrenciler();
        for (int i = 0; i < kurs1.getOgrenciSayisi(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Tester Kursu öğrenci sayisi: " + kurs2.getOgrenciSayisi());
    }
}

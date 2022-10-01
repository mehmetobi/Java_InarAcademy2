package Chapters.Chapter06.CheckPoints06;

public class Checkpoint06_MetodaParametreGonderme {
    public static void main(String[] args) {
        int s1= 5;
        int s2= 8484;
        System.out.println(" yerDegistir metodu cagrilmadan once s1: " + s1 + "s 2 " + s2 );
        yerDegistir (s1, s2);
        System.out.println(" yerDegistir metodu cagrildiktan sonra s1: " + s1 + "s 2 " + s2 );
    }

     static void yerDegistir(int sayi1, int sayi2){
         System.out.println(" Yerdegistirmeden once sayi1:" + sayi1 + " sayi2:" + sayi2 );
         int gecici = sayi1;
         sayi1 = sayi2 ;
         sayi2 = gecici;
         System.out.println(" Yerdegistirdikten sonra sayi1:" + sayi1 + " sayi2:" + sayi2 );
    }
}

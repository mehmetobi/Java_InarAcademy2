package Chapters.Chapter5;

public class Checkpoint05_Asal_Sayi {
    public Checkpoint05_Asal_Sayi() {
    }

    public static void main(String[] args) {
        int Asalsayi_sayaci = 0;

        for(int sayi = 2; Asalsayi_sayaci < 100; ++sayi) {
            boolean AsalMi = true;

            for(int i = 2; i < sayi; ++i) {
                if (sayi % i == 0) {
                    AsalMi = false;
                }
            }

            if (AsalMi) {
                ++Asalsayi_sayaci;
                System.out.println(Asalsayi_sayaci + ". asal sayi:" + sayi);
            }
        }

    }
}